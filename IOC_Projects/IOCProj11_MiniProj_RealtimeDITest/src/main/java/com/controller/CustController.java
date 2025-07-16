package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.CustModel;
import com.service.ICustService;

@Component("custcontrol")
public class CustController {
         
	@Autowired
	private ICustService iserv;
	
	public String controlFlow(CustModel mod) throws Exception {
		String res=iserv.serviceProvider(mod);
		return res;
	}
}
