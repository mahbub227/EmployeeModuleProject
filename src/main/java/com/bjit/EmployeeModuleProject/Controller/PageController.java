package com.bjit.EmployeeModuleProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bjit.EmployeeModuleProject.Exception.EmployeeNotFoundException;
import com.bjit.EmployeeModuleProject.model.Employee;
import com.bjit.EmployeeModuleProject.serviceImpl.EmployeeServiceImpl;

@Controller
public class PageController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@RequestMapping(value= "/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("userClickHome", true);
		return mv;
	}
	

	@RequestMapping(value= "/show")
	public ModelAndView showSingleProduct(@RequestParam int id) throws EmployeeNotFoundException{
		
		ModelAndView mv= new ModelAndView("home");
		Employee employee = employeeServiceImpl.findEmployee(id);
		if(employee == null) throw new EmployeeNotFoundException();
		
		
		mv.addObject("title",employee.getEmployeeName());
		mv.addObject("employee",employee);
		mv.addObject("userClickShowEmployee",true);
		
		return mv;
	}
	
	
	
}