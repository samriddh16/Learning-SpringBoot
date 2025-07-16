package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.document.Employee;
import com.repository.IEmpMongoRepo;

@Service("mongoservice")
public class IEmpMongoServiceImpl implements IEmpMongoService {

	@Autowired
	IEmpMongoRepo empRepo;
	
	@Override
	public String registerEmployee(Employee emp) {
		 String idVal=empRepo.save(emp).getId();
		return "employee is registered with the id value ::"+idVal;
	}

	@Override
	public String[] registerEmployees(List<Employee> emps) {
		
	  List<Employee> semps= empRepo.saveAll(emps);
	  String idVal[]=new String[emps.size()];
	   for(int i=0;i<idVal.length;++i) {
		     idVal[i]=semps.get(i).getId();
	   }
	   
	   return  idVal;
		
	}

	@Override
	public List<Employee> showAllEmployees() {
			return empRepo.findAll();
	}

	@Override
	public Employee findEmployeeById(String id) {
				Optional<Employee> opt= empRepo.findById(id);
				if(opt.isPresent())
					return opt.get();
				else
					throw new IllegalArgumentException("invalid id");
	}

	@Override
	public String updateEmployeeById(String id, double newSalary) {
		   // Load the Document
		 Optional<Employee> opt=empRepo.findById(id);
		  if(opt.isPresent()) {
			  //get the Document
			  Employee  emp=opt.get();
			  emp.setEmpSalary(newSalary);
			  String idVal=empRepo.save(emp).getId();
			  return  idVal+" id  document is updated with new salary";
		  }
		return id+" id  document is not found";
	}

	@Override
	public String deleteEmployeeById(String id) {
		Optional<Employee> emp = empRepo.findById(id);
		if(emp.isPresent()) {
			empRepo.deleteById(id);
			return "Employee with ID- "+id+" found and deleted";
		}
		return "Employee with ID- "+id+" not found";
	}

	@Override
	public List<Employee> getSortedEmp(Boolean b, String... strings) {
	    Sort sort = Sort.by(b?Direction.ASC:Direction.DESC,strings);
	    List<Employee> list = empRepo.findAll(sort);
		return list;
	}
}
