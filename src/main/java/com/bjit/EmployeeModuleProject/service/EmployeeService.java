package com.bjit.EmployeeModuleProject.service;

import java.util.List;

import com.bjit.EmployeeModuleProject.model.Employee;

public interface EmployeeService {
	
	public List<Employee> employeeList();
	public Employee addEmployee(Employee employee);
	public Employee findEmployee(Integer employeeId);
	
}
