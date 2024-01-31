package com.clintonbrito.ibmbootcampproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "categories")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

//    @OneToMany(mappedBy = "category")
//    @JoinColumn(name = "expense_id", referencedColumnName = "id")
//    private List<ExpenseEntity> expense;
}
