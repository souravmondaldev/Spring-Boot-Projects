package com.thebetterdeveloper.course1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class Course1Application {

	public static void main(String[] args) {
		SpringApplication.run(Course1Application.class, args);
	}

	@Primary
	@Bean
	public String basicMessage(){
		System.out.println("Inside the bean");
		return "Hello";
	}
	@Bean
	public String compoundMessage( String basicMessage ){
		System.out.println("Inside compound Message, Received: "+ basicMessage);
		return basicMessage+" Spring!";
	}
	@Bean
	public int characterCount( String message ){
		return message.length();
	}
}
