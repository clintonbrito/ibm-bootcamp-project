package com.clintonbrito.ibmbootcampproject.repositories;

import com.clintonbrito.ibmbootcampproject.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
