package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.entity.Customer;

public interface ICustomerPageSort extends PagingAndSortingRepository<Customer, Integer>,CrudRepository<Customer, Integer> {

}
