package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.StdModel;
import com.service.IStdService;

@Component("stdcontrol")
public class StdController {
         
	@Autowired
	private IStdService iserv;
	
	public String controlFlow(StdModel mod) throws Exception {
		String res=iserv.serviceProvider(mod);
		return res;
	}
}
