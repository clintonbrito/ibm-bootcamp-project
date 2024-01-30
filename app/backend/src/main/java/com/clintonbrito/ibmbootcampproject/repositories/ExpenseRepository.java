package com.clintonbrito.ibmbootcampproject.repositories;

import com.clintonbrito.ibmbootcampproject.entities.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {

}
