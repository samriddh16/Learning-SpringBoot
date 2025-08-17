package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Patient;

public interface IPatRepo extends JpaRepository<Patient, Integer> {

}
