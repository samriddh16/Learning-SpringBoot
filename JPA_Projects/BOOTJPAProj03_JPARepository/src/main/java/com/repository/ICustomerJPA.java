package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.entity.Customer;

public interface ICustomerJPA extends JpaRepository<Customer, Integer> {

}
