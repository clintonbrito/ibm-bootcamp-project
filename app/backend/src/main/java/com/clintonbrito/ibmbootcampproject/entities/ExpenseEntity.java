package com.clintonbrito.ibmbootcampproject.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "expenses")
public class ExpenseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "category", nullable = false, length = 30)
    private String category;

    @CreatedDate
    @Column(name = "date", nullable = false)
    private LocalDate date;
}
