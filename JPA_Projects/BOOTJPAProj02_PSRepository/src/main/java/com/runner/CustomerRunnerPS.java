package com.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.entity.Customer;
import com.service.ICustomerService;

@Component("runner")
public class CustomerRunnerPS implements CommandLineRunner {

    @Autowired
    ICustomerService service;

	@Override
	public void run(String... args) throws Exception {
		/*
		try {
			Iterable<Customer> cust = service.custServiceSortCustomer(true, "cbillamt");
			cust.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		

		/*try {
			Iterable<Customer> cust = service.custServiceSortCustomer(false, "cbillamt","caddrs");
			cust.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		// For different ordering of multiple properties	 
		/*try {
			Iterable<Customer> cust = service.custServiceSortCustomer(Sort.Order.desc("cbillamt"),Sort.Order.asc("caddrs"));
			cust.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			Page<Customer> page = service.custServiceGetPages(3, 4);
			page.getContent().forEach(System.out::println);
			System.out.println("Page Number- "+page.getNumber());
			System.out.println("No of records on this page- "+page.getNumberOfElements());
			System.out.println("Page Size- "+page.getSize());
			System.out.println("Total Elements- "+page.getTotalElements());
			System.out.println("Total Pages- "+page.getTotalPages());
			System.out.println("First page or not?- "+page.isFirst());
			System.out.println("Last page or not?- "+page.isLast());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Page<Customer> page = service.custServiceGetSortedPages(3, 4, true, "cbillamt","cname");
			page.getContent().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			service.custServiceGetPageByPage(4);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
