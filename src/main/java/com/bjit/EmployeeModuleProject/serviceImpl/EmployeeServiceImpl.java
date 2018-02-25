package com.bjit.EmployeeModuleProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.EmployeeModuleProject.model.Employee;
import com.bjit.EmployeeModuleProject.repository.EmployeeRepository;
import com.bjit.EmployeeModuleProject.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> employeeList() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}


	@Override
	public Employee findEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		return employeeRepository.findOne(employeeId);
	}

	
	

}