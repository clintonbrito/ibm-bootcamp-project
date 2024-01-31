package com.clintonbrito.ibmbootcampproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

}
