package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}
