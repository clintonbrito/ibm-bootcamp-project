package com.clintonbrito.ibmbootcampproject;

import jakarta.persistence.EntityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IbmBootcampProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbmBootcampProjectApplication.class, args);
		System.out.println("Hello World!");
	}

}
