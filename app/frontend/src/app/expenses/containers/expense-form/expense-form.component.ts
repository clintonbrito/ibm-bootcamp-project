import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute } from '@angular/router';

import { ExpensesService } from '../../services/expenses.service';
import { Expense } from '../../model/expense';

@Component({
  selector: 'app-expense-form',
  templateUrl: './expense-form.component.html',
  styleUrl: './expense-form.component.scss'
})
export class ExpenseFormComponent implements OnInit {

  form = this.formBuilder.group({
    id: [''],
    description: [''],
    amount: [0],
    date: [new Date],
    category: [''],
  });

  constructor(
    private formBuilder: FormBuilder,
    private expensesService: ExpensesService,
    private snackBar: MatSnackBar,
    private location: Location,
    private route: ActivatedRoute
  ) {
    // this.form
  }

  ngOnInit(): void {
    const expense: Expense = this.route.snapshot.data['expense'];
    // esse 'expense' tem que ser o nome exatamente igual ao que está no arquivo 'expenses-routing.module.ts', dentro do `resolve` do `routes`!

    this.form.setValue({
      id: expense.id,
      description: expense.description,
      amount: expense.amount,
      date: expense.date,
      category: expense.category
    });
  }

  onSubmit() {
    this.expensesService.save(this.form.value as Partial<Expense>)
      .subscribe({
        next: () => this.onSuccess(),
        error: () => this.onError()
      });
  }

  onCancel() {
    this.location.back();
  }

  private onSuccess() {
    this.snackBar.open('Expense saved succesfully.', '', { duration: 3000 });
    this.onCancel();
  }

  private onError() {
    this.snackBar.open('Error saving expense.', '', { duration: 3000 });
  }

}
