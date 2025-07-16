package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootjpaProj01CrudRepositoryApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(BootjpaProj01CrudRepositoryApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
