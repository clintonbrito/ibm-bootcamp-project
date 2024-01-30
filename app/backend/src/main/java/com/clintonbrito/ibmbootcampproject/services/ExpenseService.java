package com.clintonbrito.ibmbootcampproject.services;

import com.clintonbrito.ibmbootcampproject.entities.ExpenseEntity;
import com.clintonbrito.ibmbootcampproject.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<ExpenseEntity> listAllExpenses() {
        return expenseRepository.findAll();
    }

    public Optional<ExpenseEntity> getExpenseById(Long id) {
        return expenseRepository.findById(id);
    }

    public ExpenseEntity saveOrUpdateExpense(ExpenseEntity expense) {
        return expenseRepository.save(expense);
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
