package com.service;

import java.util.List;

import com.model.Employee;

public interface IEmployeeMgmtService {
    public  List<Employee>  fetchAllEmployees();
    public   String registerEmployee(Employee emp);
    public   Employee  getEmployeeByNo(int no);
    public   String  updateEmployee(Employee emp);
    public  String  deleteEmployee(int no);
}
