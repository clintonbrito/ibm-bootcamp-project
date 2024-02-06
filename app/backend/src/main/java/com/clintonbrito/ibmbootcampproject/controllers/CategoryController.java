package com.clintonbrito.ibmbootcampproject.controllers;

import com.clintonbrito.ibmbootcampproject.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<String>> findAll() {
//        return categoryService.listAllCategories();
        List<String> categories = categoryService.listAllCategories();
        return ResponseEntity.ok(categories);
    }
}