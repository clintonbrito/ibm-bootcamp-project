import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ExpenseFormComponent } from './containers/expense-form/expense-form.component';
import { ExpensesComponent } from './containers/expenses/expenses.component';
import { expenseResolver } from './guards/expense.resolver';

const routes: Routes = [
  { path: '', component: ExpensesComponent },
  { path: 'new', component: ExpenseFormComponent, resolve: { expense: expenseResolver } },
  { path: 'edit/:id', component: ExpenseFormComponent, resolve: { expense: expenseResolver } },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ExpensesRoutingModule { }
