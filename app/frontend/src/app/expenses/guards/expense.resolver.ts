import { inject } from '@angular/core';
import { ActivatedRouteSnapshot, ResolveFn, RouterStateSnapshot } from '@angular/router';
import { of } from 'rxjs';

import { Expense } from '../model/expense';
import { ExpensesService } from '../services/expenses.service';

export const expenseResolver: ResolveFn<Expense> =
  (route: ActivatedRouteSnapshot, _state: RouterStateSnapshot) => {
    if(route.params['id']) {
      return inject(ExpensesService).loadById(route.paramMap.get('id')!);
    }
    return of({ id: '', description: '', amount: 0, date: new Date(), category: '' });
  }
