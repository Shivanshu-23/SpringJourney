package com.myApp.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// Main class that marks the entry point of the Spring Boot application
@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		// Initialize the Spring ApplicationContext by running the Spring Boot application
		ApplicationContext context = SpringApplication.run(Project1Application.class, args);

		// Retrieve the Developer bean from the Spring ApplicationContext
		// Spring automatically creates a Developer instance due to the @Component annotation
				Developer Shivanshu = context.getBean(Developer.class);


		// Call the build() method on the Developer object, (Shivanshu)
				Shivanshu.build();
	}

}
