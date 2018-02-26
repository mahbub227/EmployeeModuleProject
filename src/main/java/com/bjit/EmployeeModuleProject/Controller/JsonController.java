package com.bjit.EmployeeModuleProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjit.EmployeeModuleProject.model.Employee;
import com.bjit.EmployeeModuleProject.service.EmployeeService;

@Controller
@RequestMapping("/json")
public class JsonController {

	@Autowired
	EmployeeService employeeService;
	@ResponseBody
	@RequestMapping("/employees")
	public List<Employee>getAllEmployee(){
		return employeeService.employeeList();
	}
}
