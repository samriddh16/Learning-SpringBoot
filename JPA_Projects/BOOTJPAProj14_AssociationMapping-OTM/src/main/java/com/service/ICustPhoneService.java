package com.service;

import java.util.List;

import com.entity.Customer;
import com.entity.PhoneNumber;

public interface ICustPhoneService {

	public Integer saveDataUsingCust(Customer c);
	
	public Integer saveDataUsingPhone(PhoneNumber p);
	
	public List<Customer> getDataUsingCustomer();
	
	public List<PhoneNumber> getDataUsingPhoneNumber();

	void deleteDataUsingCustomer(int id);
}
