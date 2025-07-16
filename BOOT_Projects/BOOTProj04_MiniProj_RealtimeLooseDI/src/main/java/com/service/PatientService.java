package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.IDAO;
import com.model.Employee;

@Service("pservice")
public class PatientService implements ISERVICE {

	@Autowired
	@Qualifier("dao")
	private IDAO dao;
	
	@Override
	public List<Employee> fetchCoronoPatients(String c1, String c2, String c3) throws Exception {
		System.out.println("PatientService.fetchCoronoPatients()");
		List<Employee> list= dao.getPatients(c1, c2, c3);
		
		return list;
	}
}
