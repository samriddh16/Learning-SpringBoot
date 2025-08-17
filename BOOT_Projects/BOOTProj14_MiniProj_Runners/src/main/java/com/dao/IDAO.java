package com.dao;

import java.util.List;

import com.model.Employee;

public interface IDAO {

      public List<Employee> getPatients(String c1,String c2,String c3) throws Exception;	
}
