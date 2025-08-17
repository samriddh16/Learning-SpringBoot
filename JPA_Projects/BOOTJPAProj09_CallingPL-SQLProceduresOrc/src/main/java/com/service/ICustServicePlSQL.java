package com.service;

import java.util.List;

import com.entity.Customer;

public interface ICustServicePlSQL {

	public List<Customer> callingPlSqlProd(Double start, Double end);
}
