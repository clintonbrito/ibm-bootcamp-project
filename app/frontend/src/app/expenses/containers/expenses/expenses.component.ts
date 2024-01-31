import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError, Observable, of } from 'rxjs';

import { ErrorDialogComponent } from '../../../shared/components/error-dialog/error-dialog.component';
import { Expense } from '../../model/expense';
import { ExpensesService } from '../../services/expenses.service';

@Component({
  selector: 'app-expenses',
  templateUrl: './expenses.component.html',
  styleUrl: './expenses.component.scss'
})
export class ExpensesComponent implements OnInit {

  expenses$: Observable<Expense[]>;

  constructor(
    private expensesService: ExpensesService,
    public dialog: MatDialog,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.expenses$ = expensesService.findAll()
      .pipe(catchError(error => {
        this.onError('Error loading expenses.');
      // console.error(error);
      return of([]);
    }));
  }

  onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg,
    })
  }

  onAdd() {
    this.router.navigate(['new'], { relativeTo: this.route });
  }

  onEdit(expense: Expense) {
    this.router.navigate(['edit', expense.id], { relativeTo: this.route });
  }

  onDelete(expense: Expense) {
    this.expensesService.delete(expense.id)
      .subscribe(() => {
        this.expenses$ = this.expensesService.findAll();
      });
  }

  ngOnInit(): void {
  }

}
