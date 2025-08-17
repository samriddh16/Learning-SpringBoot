package com.runner;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.repository.IEmpMongoRepo;

@Component("mongorunner")
public class EmpMongoRunner implements CommandLineRunner {
	
	@Autowired
	IEmpMongoRepo repo;

	@Override
	public void run(String... args) throws Exception {
	
		try {
			/*repo.getEmployeeByAddr().forEach(System.out::println);*/
			/*repo.getEmployeeByAddr("Patna").forEach(System.out::println);*/
			/*Object[] obj = repo.getEmployeeByAddr2("Raipur");
			for(Object e: obj) {
				  System.out.println("Record -> "+e);
			}*/
			/*repo.getEmployeeByAddr5(30000,100000).forEach(System.out::println);*/
			/*repo.getEmployeeByAddr7("Raipur",90000).forEach(System.out::println);*/
			/*repo.getEmployeeByAddr8("Raipur","Delhi","Patna").forEach(System.out::println);*/
			/*Object[] obj = repo.getEmployeeByRegex1("r");
			for(Object o: obj) {
				System.out.println("Record -> "+o);
			}*/
			/*Object[] obj = repo.getEmployeeByRegex2("r");
			for(Object o: obj) {
				System.out.println("Record -> "+o);
			}*/
			/*Object[] obj = repo.getEmployeeByRegex2("^r.*");
			for(Object o: obj) {
				System.out.println("Record -> "+o);
			}*/
			/*Object[] obj = repo.getEmployeeByRegex2("h$");
			for(Object o: obj) {
				System.out.println("Record -> "+o);
			}*/
			/*repo.getEmployeeByRegex3("h$").forEach(System.out::println);*/
			/*repo.getSortedEmployees().forEach(System.out::println);*/
			/*System.out.println(repo.deleteEmployee());*/
			System.out.println(repo.isEmpsFoundBySalaryRange(80000, 600000));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
