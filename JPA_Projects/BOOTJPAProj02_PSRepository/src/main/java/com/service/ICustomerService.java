package com.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.entity.Customer;

public interface ICustomerService {

	public Iterable<Customer> custServiceSortedCustomer(Boolean b, String... args);
	
	public Iterable<Customer> custServiceSortedCustomer(Sort.Order...orders);
	
	public Page<Customer> custServiceGetPages(int pageno, int pagesize);
	
	public Page<Customer> custServiceGetSortedPages(int pageno, int pagesize, boolean b, String... args);
	
	public void custServiceGetPageByPage(int pagesize);
}
