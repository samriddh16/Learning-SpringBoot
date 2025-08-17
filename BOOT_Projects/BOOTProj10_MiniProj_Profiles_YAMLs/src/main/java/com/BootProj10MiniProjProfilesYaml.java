package com;

import java.util.List;
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
public class BootProj10MiniProjProfilesYaml {


	@Bean("combopool")
	@ConfigurationProperties(prefix = "c3p0")
	@Profile("uat")
	ComboPooledDataSource getpool() throws Exception {
	    ComboPooledDataSource cpd = new ComboPooledDataSource();     
	    return cpd;
	}
	
	public static void main(String[] args) {
	
		    ConfigurableApplicationContext cax = SpringApplication.run(BootProj10MiniProjProfilesYaml.class, args);
			ControllerApp ca = cax.getBean(ControllerApp.class);
			List<Employee> list=null;
			try {
				list = ca.monitoringFlow("Delhi","Pune","Chennai");
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Total records fetched: " + list.size());
			list.forEach(emp ->{System.out.println(emp);});
	}
}
