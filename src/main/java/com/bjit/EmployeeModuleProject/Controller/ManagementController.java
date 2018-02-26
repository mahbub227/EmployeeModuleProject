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


@Controller
public class ManagementController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	private Employee employee;
	
	private static final Logger logger =LoggerFactory.getLogger(ManagementController.class);
	

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createEmployee(@RequestParam(name = "operation", required = false) String operation) {

		ModelAndView mv = new ModelAndView("home");
		

		if (operation != null) {

			if (operation.equals("employee")) {
				mv.addObject("userClickHome", true);
				mv.addObject("message", "New Product Added!");
			}

		}
		else {
			
		
			mv.addObject("userClickCreate", true);
			Employee employee = new Employee();
			mv.addObject("employee", employee);
		}
		return mv;
	}
	@RequestMapping(value="/create",method=RequestMethod.POST)
public String handleEmployeeSubmission(@Valid @ModelAttribute("employee") Employee employee,BindingResult results, Model model,HttpServletRequest request) {

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
	
	@RequestMapping(value="/edit")
	public ModelAndView editEmployee(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("userClickCreate", true);
		Employee employee = employeeServiceImpl.findEmployee(id);
		mv.addObject("employee", employee);
		return mv;
	}

	
	
	

	@ModelAttribute("employees")
	public List<Employee> getEmployee() {
		return employeeServiceImpl.employeeList();
	}
	
}
