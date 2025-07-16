package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.document.DrivingLicense;

public interface IOTODrivingLicenseRepo extends MongoRepository<DrivingLicense, String> {

}
