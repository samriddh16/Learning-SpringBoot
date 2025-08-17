package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Customer;

public interface ICustRepo extends JpaRepository<Customer, Integer> {

}
