package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Finder methods work just like they did in spring data JPA so no proj for that in mongodb
@SpringBootApplication
public class BootMongoDbProj01MongoRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMongoDbProj01MongoRepositoryApplication.class, args);
	}

}
