package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.IStdDao;
import com.model.StdModel;

@Service("stdserv")
public class StdServiceImpl implements IStdService {
	
	@Autowired
	@Qualifier("dao")
	private IStdDao idao;

	@Override
	public String serviceProvider(StdModel mod) throws Exception {
		String st=null;
		float total= mod.getMarks1()+mod.getMarks2()+mod.getMarks3();
		float avg= total/3.0f;
		mod.setTotal(total);
		mod.setAvg(avg);
		int result=idao.dbInsert(mod);
		if(result==1)
			st="Record Inserted Successfully";
		else
			st="Record Insertion Failed";
		 
		return st;
				
	}
}
