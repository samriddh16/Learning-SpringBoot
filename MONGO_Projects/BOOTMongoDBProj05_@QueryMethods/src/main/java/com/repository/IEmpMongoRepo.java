package com.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.document.Employee;

public interface IEmpMongoRepo extends MongoRepository<Employee, String> {
	
	@Query(value = "{empAddr:Raipur}")
	public List<Employee> getEmployeeByAddr();
	
	@Query(value = "{empAddr:?0}")
	public List<Employee> getEmployeeByAddr2(String addr);
	
	// When we write like this then it will display all the fields of employee class but with empSalary
	// and other fields as null
	@Query(fields= "{empName:1,empAddr:1}" ,value = "{empAddr:?0}")
	public Object[] getEmployeeByAddr3(String addr);
	
	@Query(value = "{empAddr:?0,empSalary:?1}")
	public List<Employee> getEmployeeByAddr4(String addr, Integer sal);
	
	@Query(value = "empSalary:{$gte:?1},empSalary:{$lte:?2}}")
	public List<Employee> getEmployeeByAddr5(Integer start, Integer end);
	
	// Count returns int value of total count
	@Query(value = "empSalary:{$gte:?1},empSalary:{$lte:?2}}", count = true)
	public int getEmployeeByAddr6(Integer start, Integer end);
	
	@Query(value = "{$or:[{empAddr:?0},{empSalary:?1}]}")
	public List<Employee> getEmployeeByAddr7(String addr, Integer sal);
	
	@Query(value = "{empAddr:{$in:[?0,?1,?2]}}")
	public List<Employee> getEmployeeByAddr8(String addr1, String addr2, String addr3);
	
	// By default regex is case sensitive
	@Query(fields = "{id:0,empName:1,empAddr:1,empSalary:1}",value = "{empName:{'$regex':?0}}")
	public Object[] getEmployeeByRegex1(String st);
	
	// Remember when we use Object[] with fields then if some record is having null values for the field
	// that we have given in the fields property then that field value will not be displayed in the final 
	// result, but this is not the case with List<Employee>
	@Query(fields = "{id:0,empName:1,empAddr:1,empSalary:1}",value = "{empName:{'$regex':?0, '$options':'i'}}")
	public Object[] getEmployeeByRegex2(String st);
	
	@Query(fields = "{}",value = "{empName:{'$regex':?0, '$options':'i'}}")
	public List<Employee> getEmployeeByRegex3(String st);
	
	// This value property is necessary here
	@Query(value = "{}", sort = "{empName:-1, empAddr:-1}")
	public List<Employee> getSortedEmployees();
	
	// value property is like conditions in sql queries
	// Delete returns int value of how many records are deleted
	@Query(value = "{empName:Ramesh, empSalary:null}", delete = true)
	public int deleteEmployee();
	
	// MongoDB is schema-less, so using a wrong field like 'salary' (instead of 'empSalary') won't throw an error.
	// The query runs without exceptions but returns no matching documents.
	// As a result, methods like `exists = true` return false.
	// This behavior can silently fail if field names are incorrect.
	// Always double-check field names in @Query against your document model.
	// Exists returns boolean value (True if record exist, False is not)
	@Query(value = "{empSalary:{$gte:?0},empSalary:{$lte:?1}}",exists = true)
	public  boolean  isEmpsFoundBySalaryRange(double start, double end);
}
