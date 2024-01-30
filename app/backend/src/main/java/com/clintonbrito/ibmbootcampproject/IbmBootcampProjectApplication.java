package com.clintonbrito.ibmbootcampproject;

import com.clintonbrito.ibmbootcampproject.entities.CategoryEntity;
import com.clintonbrito.ibmbootcampproject.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Configurable;
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

}
