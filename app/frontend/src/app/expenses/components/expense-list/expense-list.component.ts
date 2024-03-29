import { Component, EventEmitter, Input, Output } from '@angular/core';

import { Expense } from '../../model/expense';

@Component({
  selector: 'app-expenses-list',
  templateUrl: './expense-list.component.html',
  styleUrls: ['./expense-list.component.scss']
})
export class ExpensesListComponent {

  @Input() expenses: Expense[] = [];
  @Output() add = new EventEmitter<boolean>();
  @Output() edit = new EventEmitter<Expense>();
  @Output() delete = new EventEmitter<Expense>();

  readonly displayedColumns = ['description', 'amount', 'date', 'category', 'actions'];

  onAdd() {
    this.add.emit(true);
  }

  onEdit(expense: Expense) {
    this.edit.emit(expense);
  }

  onDelete(expense: Expense) {
    this.delete.emit(expense);
  }

}
