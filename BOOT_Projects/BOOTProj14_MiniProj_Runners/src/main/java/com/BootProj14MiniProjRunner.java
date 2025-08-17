package com;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.controller.ControllerApp;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.model.Employee;

@SpringBootApplication
public class BootProj14MiniProjRunner {
	
	@Bean("combopool")
	@ConfigurationProperties(prefix = "c3p0")
	@Profile("uat")
	ComboPooledDataSource getpool() throws Exception {
	    ComboPooledDataSource cpd = new ComboPooledDataSource();     
	    return cpd;
	}
	
	public static void main(String[] args) {

		   SpringApplication.run(BootProj14MiniProjRunner.class, args);
			
	}
}
