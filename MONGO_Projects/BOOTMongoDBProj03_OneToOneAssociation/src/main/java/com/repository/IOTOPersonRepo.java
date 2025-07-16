package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.document.Person;

public interface IOTOPersonRepo extends MongoRepository<Person, String> {

}
