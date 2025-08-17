package com.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.service.ICustServicePlSQL;

@Component("runner")
public class CustServicePLSQLRunner implements CommandLineRunner {

	@Autowired
	ICustServicePlSQL service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			service.callingPlSqlProd(80000.0, 100000.0).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
