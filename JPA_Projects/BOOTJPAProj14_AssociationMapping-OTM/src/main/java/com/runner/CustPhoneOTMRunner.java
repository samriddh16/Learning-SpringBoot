package com.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.service.ICustPhoneService;

@Component("runner")
public class CustPhoneOTMRunner implements CommandLineRunner {
	
	@Autowired
	ICustPhoneService service;

	@Override
	public void run(String... args) throws Exception {
		/*Customer cust = new Customer("Samriddh","Patna");
		PhoneNumber ph1 = new PhoneNumber(9374398393L,"Residence","Airtel");
		PhoneNumber ph2 = new PhoneNumber(8274788393L,"Home","Jio");
		Set<PhoneNumber> phoneSet = new HashSet<>();
		phoneSet.add(ph1); phoneSet.add(ph2);
		cust.setPhone(phoneSet);       // Linking Child with Parent
		ph1.setCust(cust); ph2.setCust(cust);   // Linking Parent with Child
		try {
			System.out.println("Customer saved with ID- "+service.saveDataUsingCust(cust));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		/*
		Customer cust=new Customer("Suresh", "Delhi");
		   //child object
		PhoneNumber ph1=new PhoneNumber(7199999991L,"Office", "Jio");
		PhoneNumber ph2=new PhoneNumber(6188888881L,"Residence", "Vi");
		// Link childs to parent and vice-versa
		   Set<PhoneNumber> phonesSet=new HashSet<PhoneNumber>();
		   phonesSet.add(ph1); phonesSet.add(ph2);   
		   ph1.setCust(cust); ph2.setCust(cust); //parent is linked with child
		  cust.setPhone(phonesSet);  //chids are linked with parent
		  
		  try {
			System.out.println("Ph1 record saved with ID- "+service.saveDataUsingPhone(ph1));
			System.out.println("Ph2 record saved with ID- "+service.saveDataUsingPhone(ph2));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			List<Customer> list = service.getDataUsingCustomer();
			list.forEach(cust->{
				System.out.println("Parent-> "+cust);
				cust.getPhone().forEach(System.out::println);
				System.out.println("-----------------------------------------------");
			});
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			List<PhoneNumber> list = service.getDataUsingPhoneNumber();
			list.forEach(phone->{
				System.out.println("Child-> "+phone);
				System.out.println("Parent-> "+ phone.getCust());
				System.out.println("-----------------------------------------------");
			});
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			service.deleteDataUsingCustomer(152);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
