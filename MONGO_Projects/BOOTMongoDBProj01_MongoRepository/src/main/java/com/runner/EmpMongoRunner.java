package com.runner;

import java.util.UUID;

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
		/*try {
		 Employee emp=new Employee(1010, "Raja", "Mumbai", 690000.0);
		String msg=empService.registerEmployee(emp);
		System.out.println(msg);
		}
		catch(Exception e) {
		e.printStackTrace();
		}*/
	
		// @NonNull from Lombok does not enforce validation at runtime by default — it just generates 
		// null checks in the constructor.
		// In the json format data the properties which are set to null be not be visible but when we
		// fetch the records they will be shown as null
		/*try {
			 Employee emp1=new Employee();
			 emp1.setEmpNo(1002); emp1.setEmpName("ramesh");
			 Employee emp2=new Employee(1003, "Suresh", "Vizag", 888998.0);
			 String idVal[]=empService.registerEmployees(List.of(emp1, emp2));
			 System.out.println("saved docs id Values are ::"+Arrays.toString(idVal));
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
	
		/*try {
		  empService.showAllEmployees().forEach(emp->{
			  System.out.println(emp);
		  });
		}//try
		catch(Exception e) {
		  e.printStackTrace();
		}*/
	
		/*try {
			Employee e=empService.findEmployeeById("6875184823ebd1500419e131");
			System.out.println(e);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
	
		/*try {
		String msg=empService.updateEmployeeById("6875184823ebd1500419e131", 120000.0);
		System.out.println(msg);
		}
		catch(Exception e) {
		 e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(empService.deleteEmployeeById("6875184823ebd1500419e131"));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			empService.getSortedEmp(true, "empName","empAddr").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		// UUID give a little different id that the inbuilt system of mongodb
		try {
			 Employee emp=new Employee(UUID.randomUUID().toString(),1001, "Rahul", "Kanpur", 90000.0);
			String msg=empService.registerEmployee(emp);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
