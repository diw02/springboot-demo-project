package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MAIN APPLICATION ENTRY POINT
 * 
 * This is the starting point of the Spring Boot application.
 * When you run your app, Java looks for the main() method here first.
 * 
 * What happens:
 * - SpringApplication.run() starts the Spring Boot framework
 * - It scans your project for Spring components (like @RestController, @Service, etc.)
 * - It connects to your PostgreSQL database
 * - It starts a web server (usually on port 8080)
 */
@SpringBootApplication
// This annotation tells Spring Boot: "This is the main app, set everything up!"
public class Demo2Application {

	// The main() method is where Java starts running your code
	public static void main(String[] args) {
		// SpringApplication.run() = Start the entire Spring Boot application
		SpringApplication.run(Demo2Application.class, args);
	}

}
