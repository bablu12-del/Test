package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entities.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
