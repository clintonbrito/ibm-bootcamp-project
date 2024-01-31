package com.clintonbrito.ibmbootcampproject.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
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

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    // @Column(name = "category", nullable = false, length = 100)
    private CategoryEntity category;

    @CreatedDate
    @Column(name = "date", nullable = false)
    private LocalDate date;
}
