package com.service;

import java.util.List;

import com.entity.Customer;

public interface ICustomerService {

	public String custServiceDeleteIDBatch(Iterable<Integer> list);
	
	public Customer custServiceGetRefId(Integer id);
	
	public List<Customer> custServiceFindAll(Customer cust, Boolean order, String...strings);
	
	public List<Customer> custServiceSaveFlush(List<Customer> cust);
}
