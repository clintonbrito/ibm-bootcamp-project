package com.clintonbrito.ibmbootcampproject.controllers;

import com.clintonbrito.ibmbootcampproject.dto.ExpenseRequestDTO;
import com.clintonbrito.ibmbootcampproject.entities.ExpenseEntity;
import com.clintonbrito.ibmbootcampproject.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public List<ExpenseEntity> findAll() {
        return expenseService.listAllExpenses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ExpenseEntity>> findById(@PathVariable Long id) {
        Optional<ExpenseEntity> expense = expenseService.getExpenseById(id);

        if (expense.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(expense);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<ExpenseEntity> create(@RequestBody ExpenseRequestDTO expense) {
        ExpenseEntity savedExpense = expenseService.saveExpense(expense);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedExpense);
    }


    @PutMapping("/{id}")
    public ResponseEntity<ExpenseEntity> update(@PathVariable Long id, @RequestBody ExpenseRequestDTO expenseDTO) {
        try {
            ExpenseEntity updatedExpense = expenseService.updateExpense(id, expenseDTO);
            return ResponseEntity.status(HttpStatus.OK).body(updatedExpense);
        } catch (RuntimeException error) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Optional<ExpenseEntity> expenseToDelete = expenseService.getExpenseById(id);

        if (expenseToDelete.isPresent()) {
            expenseService.deleteExpense(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
