package com.thebetterdeveloper.course2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Course2Application {

	public static void main(String[] args) {
		SpringApplication.run(Course2Application.class, args);
	}

	@Bean
	public String message(){
		System.out.println("Creating Message Bean");
		return "Hello";
	}

	@Bean
	public String uppercaseMessage( MessageService messageService ){
		System.out.println("Uppercase bean created");
		return messageService.upperCase();
	}
	@Bean
	public String lowercaseMessage( MessageService messageService ){
		System.out.println("Lowercase bean created");
		return messageService.lowerCase();
	}
}
