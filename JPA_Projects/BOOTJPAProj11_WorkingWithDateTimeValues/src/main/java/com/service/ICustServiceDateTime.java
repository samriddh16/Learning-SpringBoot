package com.service;

import java.util.List;

import com.entity.Customer;

public interface ICustServiceDateTime {

	public int custSave(Customer c);

	List<Customer> getAllCustomers();
}