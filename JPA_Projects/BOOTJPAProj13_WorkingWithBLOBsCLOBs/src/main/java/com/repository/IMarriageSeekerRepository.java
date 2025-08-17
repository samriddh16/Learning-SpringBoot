package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.MarriageSeeker;

public interface IMarriageSeekerRepository extends JpaRepository<MarriageSeeker, Long> {

}
