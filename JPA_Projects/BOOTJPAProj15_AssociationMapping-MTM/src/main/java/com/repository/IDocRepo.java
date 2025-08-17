package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Doctor;

public interface IDocRepo extends JpaRepository<Doctor, Integer> {

}
