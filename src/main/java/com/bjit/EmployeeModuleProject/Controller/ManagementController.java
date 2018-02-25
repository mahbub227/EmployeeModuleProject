package com.bjit.EmployeeModuleProject.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bjit.EmployeeModuleProject.model.Employee;
import com.bjit.EmployeeModuleProject.serviceImpl.EmployeeServiceImpl;
import com.bjit.EmployeeModuleProject.util.FileUploadUtility;


@Controller
public class ManagementController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	private static final Logger logger =LoggerFactory.getLogger(ManagementController.class);
	

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createEmployee(@RequestParam(name = "operation", required = false) String operation) {

		ModelAndView mv = new ModelAndView("home");
		mv.addObject("title", "Create Employee");
		mv.addObject("userClickCreate", true);
		Employee employee = new Employee();
		mv.addObject("employee", employee);

		if (operation != null) {

			if (operation.equals("employee")) {
				mv.addObject("message", "New Product Added!");
			}

		}
		return mv;
	}
	@RequestMapping(value="/create",method=RequestMethod.POST)
public String handleEmployeeSubmission(@Valid @ModelAttribute("employee") Employee employee,BindingResult results, Model model,HttpServletRequest request) {
		
		
	/*	if(employee.getEmployeeId()==0) {
			new EmployeeValidator().validate(employee,results);
		}
		else {
			if(!emplyee.getFile().getOriginalFilename().equals("")) {
				new EmployeeValidator().validate(employee,results);
			}
		}*/
		
	
		
		if(results.hasErrors()) {
			model.addAttribute("userClickCreate", true);
			model.addAttribute("title","Create Employee");
			return "home";
		}
		
		
		logger.info(employee.toString());
		
		
			employeeServiceImpl.addEmployee(employee);
	
			/*if(!employee.getFile().getOriginalFilename().equals("")) {
				FileUploadUtility.uploadFile(request, employee.getFile(),employee.getEmployeeImage());
			}*/
		
		
		return "redirect:/create?operation=employee";
	}

	@ModelAttribute("employees")
	public List<Employee> getEmployee() {
		return employeeServiceImpl.employeeList();
	}
	
}
