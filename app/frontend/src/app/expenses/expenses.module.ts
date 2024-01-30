import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';

import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { SharedModule } from '../shared/shared.module';
import { ExpensesListComponent } from './components/expense-list/expense-list.component';
import { ExpenseFormComponent } from './containers/expense-form/expense-form.component';
import { ExpensesComponent } from './containers/expenses/expenses.component';
import { ExpensesRoutingModule } from './expenses-routing.module';


@NgModule({
  declarations: [
    ExpensesComponent,
    ExpenseFormComponent,
    ExpensesListComponent
  ],
  imports: [
    CommonModule,
    ExpensesRoutingModule,
    AppMaterialModule,
    SharedModule,
    ReactiveFormsModule
  ]
})
export class ExpensesModule { }
