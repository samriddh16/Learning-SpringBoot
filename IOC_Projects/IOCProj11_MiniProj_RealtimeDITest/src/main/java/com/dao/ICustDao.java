package com.dao;

import com.model.CustModel;

public interface ICustDao {
     
	public int dbInsert(CustModel mod) throws Exception;
}
