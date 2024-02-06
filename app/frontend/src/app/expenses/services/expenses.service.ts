import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { first, Observable } from 'rxjs';

import { Expense } from '../model/expense';

@Injectable({
  providedIn: 'root'
})
export class ExpensesService {

  private readonly API = '/api/v1/expenses';

  constructor(private httpClient: HttpClient) { }

  findAll() {
    return this.httpClient.get<Expense[]>(this.API)
      .pipe(first());
  }

  loadById(id: string): Observable<Expense> {
    return this.httpClient.get<Expense>(`${this.API}/${id}`)
      .pipe(first());
  }

  save(expense: Partial<Expense>) {
    if(expense.id) {
      return this.update(expense);
    }

    return this.create(expense);
  }

  private update(expense: Partial<Expense>) {
    return this.httpClient.put(`${this.API}/${expense.id}`, expense)
      .pipe(first())
  }

  private create(expense: Partial<Expense>) {
    return this.httpClient.post(this.API, expense)
      .pipe(first());
  }

  delete(id: string) {
    return this.httpClient.delete(`${this.API}/${id}`)
      .pipe(first());
  }
}
