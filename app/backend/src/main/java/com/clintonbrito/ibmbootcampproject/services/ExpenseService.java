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
    public ExpenseEntity updateExpense(Long id, ExpenseRequestDTO expenseDTO) {
        Optional<ExpenseEntity> expenseToUpdate = expenseRepository.findById(id);

        if (expenseToUpdate.isPresent()) {
            ExpenseEntity updatedExpense = expenseToUpdate.get();
            updatedExpense.setDescription(expenseDTO.getDescription());
            updatedExpense.setAmount(expenseDTO.getAmount());
            updatedExpense.setCategory(expenseDTO.getCategory());
            updatedExpense.setDate(expenseDTO.getDate());

            return expenseRepository.save(updatedExpense);
        } else {
            throw new RuntimeException("Expense not found");
        }
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
