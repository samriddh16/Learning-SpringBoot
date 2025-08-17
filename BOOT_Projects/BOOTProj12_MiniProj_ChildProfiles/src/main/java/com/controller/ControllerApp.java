package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.model.Employee;
import com.service.ISERVICE;

@Controller("control")
public class ControllerApp {

	@Autowired
	private ISERVICE serv;
	
	public List<Employee> monitoringFlow(String c1, String c2, String c3) throws Exception{
		System.out.println("ControllerApp.monitoringFlow()");
		List<Employee> list = serv.fetchCoronoPatients(c1, c2, c3);
		
		return list;  
	}
}
