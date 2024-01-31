package com.clintonbrito.ibmbootcampproject.dto;

import com.clintonbrito.ibmbootcampproject.entities.CategoryEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class ExpenseRequestDTO {
    private String description;

    private Double amount;

    private String category;

    private LocalDate date;

}
