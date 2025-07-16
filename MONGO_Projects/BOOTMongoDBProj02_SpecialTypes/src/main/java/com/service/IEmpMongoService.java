package com.service;

import java.util.List;

import com.document.Employee;

public interface IEmpMongoService {

	String registerEmployee(Employee emp);

	String[] registerEmployees(List<Employee> emps);

	List<Employee> showAllEmployees();

	Employee findEmployeeById(String id);

	String updateEmployeeById(String id, double newSalary);
	
	String deleteEmployeeById(String id);
	
	List<Employee> getSortedEmp(Boolean b, String...strings);

}
