package com.clintonbrito.ibmbootcampproject.services;

import com.clintonbrito.ibmbootcampproject.dto.ExpenseRequestDTO;
import com.clintonbrito.ibmbootcampproject.entities.ExpenseEntity;
import com.clintonbrito.ibmbootcampproject.repositories.ExpenseRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<ExpenseEntity> listAllExpenses() {
        return expenseRepository.findAll();
    }

    public Optional<ExpenseEntity> getExpenseById(Long id) {
        return expenseRepository.findById(id);
    }


    @Transactional
    public ExpenseEntity saveExpense(ExpenseRequestDTO expenseDTO) {
        ExpenseEntity expenseEntity = new ExpenseEntity();
        expenseEntity.setDescription(expenseDTO.getDescription());
        expenseEntity.setAmount(expenseDTO.getAmount());
        expenseEntity.setCategory(expenseDTO.getCategory());
        expenseEntity.setDate(expenseDTO.getDate());

        return expenseRepository.save(expenseEntity);
    }

    @Transactional
    public ExpenseEntity updateExpense(Optional<ExpenseEntity> expenseToUpdate, ExpenseRequestDTO expenseDTO) {
        if (expenseToUpdate.isEmpty()) {
            throw new RuntimeException("Expense not found");
        }
        expenseToUpdate.get().setDescription(expenseDTO.getDescription());
        expenseToUpdate.get().setAmount(expenseDTO.getAmount());
        expenseToUpdate.get().setCategory(expenseDTO.getCategory());
        expenseToUpdate.get().setDate(expenseDTO.getDate());

        return expenseRepository.save(expenseToUpdate.get());
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
