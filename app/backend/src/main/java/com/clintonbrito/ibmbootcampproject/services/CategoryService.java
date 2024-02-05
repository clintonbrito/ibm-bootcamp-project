package com.clintonbrito.ibmbootcampproject.services;

import com.clintonbrito.ibmbootcampproject.entities.CategoryEntity;
import com.clintonbrito.ibmbootcampproject.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private List<String> categories;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
        loadCategories();
    }

    private void loadCategories() {
        List<CategoryEntity> categoryEntities = categoryRepository.findAll();
        categories = categoryEntities.stream().map(CategoryEntity::getName).toList();
    }

    public List<String> listAllCategories() {
        return categories;
    }
}
