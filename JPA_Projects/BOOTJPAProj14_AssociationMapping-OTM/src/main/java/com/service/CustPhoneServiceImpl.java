package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Customer;
import com.entity.PhoneNumber;
import com.repository.ICustomerRepo;
import com.repository.IPhoneRepo;

@Service("otmservice")
public class CustPhoneServiceImpl implements ICustPhoneService {

	@Autowired
	ICustomerRepo custrepo;
	
	@Autowired
	IPhoneRepo phonerepo;
	
	@Override
	public Integer saveDataUsingCust(Customer c) {
		return custrepo.save(c).getCustId();
	}

	@Override
	public Integer saveDataUsingPhone(PhoneNumber p) {
        int idVal=phonerepo.save(p).getRegId();
		return idVal;
	}

	// Here we are fetching data using customer class object which is in One To Many association so 
	// here by default fetch type is LAZY loading i.e the associated child object will be loaded when
	// they are actually used in the program otherwise not
	@Override
	public List<Customer> getDataUsingCustomer() {
		return custrepo.findAll();
	}

	// Here we are fetching data using phoneNumber class object which is in Many To One association so 
	// here by default fetch type is EAGER loading i.e the associated parent object will be loaded automtically
	// when the child objects are loaded
	@Override
	public List<PhoneNumber> getDataUsingPhoneNumber() {
		return phonerepo.findAll();
	}
	
	// Deleting a Customer will also delete all associated PhoneNumbers (due to CascadeType.ALL).
	// But deleting a PhoneNumber directly will NOT delete the parent Customer or other PhoneNumbers.
	// Cascade works from Customer → PhoneNumber, not the reverse.
	@Override
	public void deleteDataUsingCustomer(int id) {
		  // load the parent obj
		  Optional<Customer> opt=custrepo.findById(id);
		  if(opt.isPresent()) {
			  //get Parent obj
			  Customer cust=opt.get();
			  //delete parent and  the assciated childs
			    custrepo.delete(cust);
			    System.out.println("Parent and Childs are deleted");
		  }
		  else {
			  System.out.println("Parent record not found");
		  
		  }
	}
}
