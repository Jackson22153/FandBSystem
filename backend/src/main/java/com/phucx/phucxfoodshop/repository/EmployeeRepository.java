package com.phucx.phucxfoodshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phucx.phucxfoodshop.model.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{
    
}
