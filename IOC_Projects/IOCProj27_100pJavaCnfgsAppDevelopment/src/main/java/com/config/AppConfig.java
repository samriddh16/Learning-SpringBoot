package com.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration("app")
@ComponentScan(basePackages = "com.beans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig: 0 param Constructor");
	}

	@Lazy
	@Bean(name = "ldt")
	public LocalDate getLD() {
		System.out.println("AppConfig.getLD()");
		return LocalDate.now();
	}
	
}
