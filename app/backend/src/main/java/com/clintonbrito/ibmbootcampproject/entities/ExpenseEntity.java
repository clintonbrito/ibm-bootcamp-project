package com.clintonbrito.ibmbootcampproject.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data // está incluso os getters e setters do Lombok
@Entity
@Table(name = "expenses")
public class ExpenseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


//    @NotNull(message = "Description cannot be null") // Usar Jakarta Validation API depois
//    @Size(max = 100, message = "Description cannot be longer than 100 characters") // Usar Jakarta Validation API depois
    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @OneToOne
    // @JoinColumn(name = "category_id", nullable = false)
    // @Column(name = "category", nullable = false, length = 100)
    @JoinColumn
    private CategoryEntity category;

    @Column(name = "date", nullable = false)
    private Date date;
}
