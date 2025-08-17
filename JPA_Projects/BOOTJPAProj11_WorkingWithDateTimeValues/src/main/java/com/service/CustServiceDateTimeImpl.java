package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Customer;
import com.repository.ICustRepo;

@Service("custservice")
public class CustServiceDateTimeImpl implements ICustServiceDateTime {

	@Autowired
	ICustRepo repo;

	@Override
	public int custSave(Customer c) {
		
		return repo.save(c).getCid();
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		
		return repo.findAll();
	}
}
