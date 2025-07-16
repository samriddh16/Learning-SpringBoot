package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.document.Employee;

public interface IEmpMongoRepo extends MongoRepository<Employee, String> {

}
