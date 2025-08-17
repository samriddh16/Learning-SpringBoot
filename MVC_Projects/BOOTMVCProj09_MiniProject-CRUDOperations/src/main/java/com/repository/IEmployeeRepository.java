package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
