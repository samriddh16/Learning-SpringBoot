package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.beans.Department;
import com.beans.Employee;

@SpringBootApplication
public class BootProj06BulkInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cax = SpringApplication.run(BootProj06BulkInjectionApplication.class, args);
		Employee emp = cax.getBean(Employee.class);
		System.out.println(emp.toString());
		Department dep = cax.getBean(Department.class);
		System.out.println(dep.toString());
	}

}
