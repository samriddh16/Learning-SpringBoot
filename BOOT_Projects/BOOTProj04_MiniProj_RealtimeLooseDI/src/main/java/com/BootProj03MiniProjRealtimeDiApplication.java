package com;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

import com.controller.ControllerApp;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.model.Employee;

@SpringBootApplication
@ImportResource(locations = "com/cnfgs/applicationContext.xml")
public class BootProj03MiniProjRealtimeDiApplication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city 1- ");
		String c1 = sc.nextLine().trim();
		System.out.println("Enter city 2- ");
		String c2 = sc.nextLine().trim();
		System.out.println("Enter city 3- ");
		String c3 = sc.nextLine().trim();
	
		try (ConfigurableApplicationContext cax = SpringApplication.run(BootProj03MiniProjRealtimeDiApplication.class, args)) {
			ControllerApp ca = cax.getBean(ControllerApp.class);
			List<Employee> list = ca.monitoringFlow(c1,c2,c3);
			System.out.println("Total records fetched: " + list.size());
			list.forEach(emp ->{System.out.println(emp);});
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
