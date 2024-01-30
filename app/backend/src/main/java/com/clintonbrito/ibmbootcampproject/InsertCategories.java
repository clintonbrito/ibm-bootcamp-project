package com.clintonbrito.ibmbootcampproject;

import com.clintonbrito.ibmbootcampproject.entities.CategoryEntity;
import com.clintonbrito.ibmbootcampproject.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCategories {
	@Bean
	CommandLineRunner insertCategories(CategoryRepository repository) {
		return args -> {
			String[] categories = {"Food", "Transport", "Health", "Education", "Entertainment", "Others"};

			for (String category : categories) {
				CategoryEntity categoryEntity = new CategoryEntity();
				categoryEntity.setName(category);
				repository.save(categoryEntity);
			}
		};
	}
}
