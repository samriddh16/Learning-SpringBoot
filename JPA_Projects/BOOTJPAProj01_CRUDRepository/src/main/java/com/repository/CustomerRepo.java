package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
