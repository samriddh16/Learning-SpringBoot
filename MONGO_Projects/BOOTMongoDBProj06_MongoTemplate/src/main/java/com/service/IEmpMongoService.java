package com.service;

import java.util.List;

import com.document.Employee;

public interface IEmpMongoService {

	public String registerEmployeeTemp(Employee e);
	
	public List<Employee> registerBatchEmployeeTemp(List<Employee> list);
	
	public List<Employee> findEmpBySalaryRange(Double d1, Double d2);
	
	public List<Employee> findEmpByAddr(Object...strings);
	
	public List<Employee> findEmpByAddrSalRange(Double d1, Double d2, Object st);
	
    public Employee findEmpById(String id);
    
    public List<Employee> findAllEmp();
    
    public Employee findAndUpdateEmpByEmpno(int eno, String eaddr, Double sal);

	public String findAndUpdateMulitiEmpByEsal(Double st, Double end, String addr);
	
	public String findAndUpdateEmpByEno(int eno, String eaddr, Double esal);
	
	public Employee findAndRemoveByEaddr(String eaddr);
	
	public String findAndRemoveAllByEsal(Double d1, Double d2);
}
