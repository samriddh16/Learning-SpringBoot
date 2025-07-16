package com.service;

import java.util.List;

import com.entity.Customer;

public interface ICustomerService {

	public String custService(Customer c);
	
	public String custServiceGroup(Iterable<Customer> cust);
	
	public String custServiceGroupImp(Iterable<Customer> cust);
	
	public Boolean custServiceExistId(Integer id);
	
	public Iterable<Customer> custServiceFindAllId(Iterable<Integer> ids);
	
	public Iterable<Customer> custServiceFindAll();
	
	public long custServiceCount();
	
	public String custServiceFindId(Integer id);
	
	public Customer custServiceExtractId(Integer id);
	
	public Customer custServiceFetchId(Integer id);
	
	public Customer custServiceGetId(Integer id);
	
	public String custServicePartialUpdate(Integer id, Double discount);
	
	public String custServiceRegisterOrUpdate(Customer cust);
	
	public String custServiceDeleteId(Integer id);
	
	public String custServiceDelete(Customer cust);
	
	public String custServiceDeleteAll();
	
	public String custServiceDeleteAllId(List<Integer> l);
	
	public String custServiceDeleteAll(List<Customer> c);
	
}
