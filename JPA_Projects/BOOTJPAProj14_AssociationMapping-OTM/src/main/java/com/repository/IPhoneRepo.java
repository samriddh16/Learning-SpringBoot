package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.PhoneNumber;

public interface IPhoneRepo extends JpaRepository<PhoneNumber, Integer> {

}
