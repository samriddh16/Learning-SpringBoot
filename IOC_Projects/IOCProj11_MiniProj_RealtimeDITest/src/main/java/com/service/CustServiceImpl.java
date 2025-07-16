package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.ICustDao;
import com.model.CustModel;

@Component("custserv")
public class CustServiceImpl implements ICustService {
	
	@Autowired
	private ICustDao idao;

	@Override
	public String serviceProvider(CustModel mod) throws Exception {
		String st=null;
		float interest=(mod.getPayment()*mod.getRate()*mod.getTime())/100.0f;
		mod.setInterestamt(interest);
		int result=idao.dbInsert(mod);
		if(result==1)
			st="Record Inserted Successfully";
		else
			st="Record Insertion Failed";
		 
		return st;
				
	}
}
