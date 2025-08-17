package com.service;

import java.util.List;

import com.model.Employee;

public interface ISERVICE {

	public List<Employee> fetchCoronoPatients(String c1, String c2, String c3) throws Exception;
}
