package com.bjit.EmployeeModuleProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.EmployeeModuleProject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
