package com;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.beans.SeasonFinder;

@SpringBootApplication
public class BootProj01FirstAppDiApplication {
	
    public BootProj01FirstAppDiApplication() {
		System.out.println("BootProj01FirstAppDiApplication: 0 param constructor");
	}

	@Bean("date")
    LocalDate getLD() {
    	System.out.println("BootProj01FirstAppDiApplication.getLD()");
		return LocalDate.now();
	}	

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(BootProj01FirstAppDiApplication.class, args);
		SeasonFinder s = ac.getBean(SeasonFinder.class);
		String msg= s.findSeasonName("Sam");
		System.out.println(msg);
		((AnnotationConfigApplicationContext)ac).close();
	}

}
