package com.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.controller.ControllerApp;
import com.model.Employee;

@Component("runner")
public class MiniProjRunner implements CommandLineRunner {

    @Autowired
    private ControllerApp control; 
    
	public MiniProjRunner(ControllerApp control) {
		System.out.println("MiniProjRunner: 0 param constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			List<Employee> list = control.monitoringFlow("Delhi", "Chennai", "Pune");
			list.forEach(emp->{System.out.println(emp);});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
