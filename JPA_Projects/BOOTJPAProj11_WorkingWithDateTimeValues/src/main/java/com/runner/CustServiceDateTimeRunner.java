package com.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.entity.Customer;
import com.service.ICustServiceDateTime;

@Component("runner")
public class CustServiceDateTimeRunner implements CommandLineRunner {

	@Autowired
	ICustServiceDateTime service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			/*	Customer cust = new Customer();
				cust.setCname("Samriddh");
				cust.setCaddrs("Patna");
				cust.setCbillamt(78000.0);
				cust.setCdob(LocalDateTime.of(2004,04,16,10,12,20));
				cust.setCdop(LocalDate.now());
				cust.setCtop(LocalTime.now());
				System.out.println("Customer saved with id- "+service.custSave(cust));*/
			
			service.getAllCustomers().forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
