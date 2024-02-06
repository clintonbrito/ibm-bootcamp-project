package com.clintonbrito.ibmbootcampproject;

import com.clintonbrito.ibmbootcampproject.entities.CategoryEntity;
import com.clintonbrito.ibmbootcampproject.entities.ExpenseEntity;
import com.clintonbrito.ibmbootcampproject.repositories.CategoryRepository;
import com.clintonbrito.ibmbootcampproject.repositories.ExpenseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IbmBootcampProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbmBootcampProjectApplication.class, args);
		System.out.println("Hello World!");
	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:4200");
//			}
//		};
//	}

	@Bean
//	@Profile("test")
	CommandLineRunner initDatabase(CategoryRepository categoryRepository, ExpenseRepository expenseRepository) {
		return args -> {
			categoryRepository.deleteAll();
			expenseRepository.deleteAll();

			// Create categories
			CategoryEntity c1 = new CategoryEntity();
			c1.setName("Food");
			categoryRepository.save(c1);

			CategoryEntity c2 = new CategoryEntity();
			c2.setName("Transport");
			categoryRepository.save(c2);

			CategoryEntity c3 = new CategoryEntity();
			c3.setName("Entertainment");
			categoryRepository.save(c3);

			CategoryEntity c4 = new CategoryEntity();
			c4.setName("Health");
			categoryRepository.save(c4);

			CategoryEntity c5 = new CategoryEntity();
			c5.setName("Education");
			categoryRepository.save(c5);

			CategoryEntity c6 = new CategoryEntity();
			c6.setName("Other");
			categoryRepository.save(c6);

			// Create expenses
			ExpenseEntity e1 = new ExpenseEntity();
			e1.setDescription("Almoço no iFood");
			e1.setAmount(30.50);
			e1.setCategory(c1);
			e1.setDate(java.time.LocalDate.now());
			expenseRepository.save(e1);

			ExpenseEntity e2 = new ExpenseEntity();
			e2.setDescription("Uber");
			e2.setAmount(12.50);
			e2.setCategory(c2);
			e2.setDate(java.time.LocalDate.now());
			expenseRepository.save(e2);

			ExpenseEntity e3 = new ExpenseEntity();
			e3.setDescription("Ingresso do cinema");
			e3.setAmount(15.20);
			e3.setCategory(c3);
			e3.setDate(java.time.LocalDate.now());
			expenseRepository.save(e3);

			ExpenseEntity e4 = new ExpenseEntity();
			e4.setDescription("Compras na farmácia");
			e4.setAmount(52.37);
			e4.setCategory(c4);
			e4.setDate(java.time.LocalDate.now());
			expenseRepository.save(e4);

			ExpenseEntity e5 = new ExpenseEntity();
			e5.setDescription("Livros na Amazon");
			e5.setAmount(44.75);
			e5.setCategory(c5);
			e5.setDate(java.time.LocalDate.now());
			expenseRepository.save(e5);

			ExpenseEntity e6 = new ExpenseEntity();
			e6.setDescription("Crédito no celular");
			e6.setAmount(20.00);
			e6.setCategory(c6);
			e6.setDate(java.time.LocalDate.now());
			expenseRepository.save(e6);

		};
	}

}
