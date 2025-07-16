package com.runner;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.document.Employee;
import com.service.IEmpMongoService;

@Component("mongorunner")
public class EmpMongoRunner implements CommandLineRunner {
	
	@Autowired
	IEmpMongoService empService;

	@Override
	public void run(String... args) throws Exception {
		/*Properties prop = new Properties();
		prop.put("DrivingID", 723382392); prop.put("AadharID", 82289432);
		Employee emp = new Employee(7264,"Arya","Pune",88382.0,new String[] {"Blue","Yellow","Orange","Black"},
				List.of("Priya","Yash","Vaibhav"),Set.of(3727923383L,382827354L,2928378583L),prop,Map.of(6734,"Jeevan Suraksha",8956,"LIC"));
		try {
			System.out.println(empService.registerEmployee(emp));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			System.out.println(empService.findEmployeeById("687673b37f76aae35a88af5b"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
