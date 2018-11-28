package io.javabrains.springbootstarter;

// Code Below tells Spring that this is a Spring application that I'm creating by library imports.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp 
{
	public static void main(String[] args) 
	{
		// Start the application.
		// Create sub-let container.
		// Host application in sub-let container.
		SpringApplication.run(CourseApiApp.class, args);

	}

}
