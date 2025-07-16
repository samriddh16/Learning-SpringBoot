package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.beans.Student;

@SpringBootApplication
@PropertySource("com/commons/applicationContext.properties")
public class BootProj07SpecialValuesInjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cax = SpringApplication.run(BootProj07SpecialValuesInjApplication.class, args);
		Student std = cax.getBean(Student.class);
		System.out.println(std);
		cax.close();
	}

}
