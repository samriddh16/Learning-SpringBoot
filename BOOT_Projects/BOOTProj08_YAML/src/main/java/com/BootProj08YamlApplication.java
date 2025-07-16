package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.beans.Student;
import com.factory.YamlPropertySourceFactory;

@SpringBootApplication
@PropertySource(value = "classpath:application1.yaml", factory = YamlPropertySourceFactory.class)
public class BootProj08YamlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cax = SpringApplication.run(BootProj08YamlApplication.class, args);
		Student std = cax.getBean(Student.class);
		System.out.println(std);
		cax.close();
	}

}
