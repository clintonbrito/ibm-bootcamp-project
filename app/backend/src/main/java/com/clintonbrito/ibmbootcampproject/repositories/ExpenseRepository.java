package com.clintonbrito.ibmbootcampproject.repositories;

import com.clintonbrito.ibmbootcampproject.entities.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {

}
