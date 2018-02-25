package com.bjit.EmployeeModuleProject.Exception;

import java.io.Serializable;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class EmployeeNotFoundException extends Exception implements Serializable{
	public static final long serialVersionUID = 1L;
	private String message;
	
	public EmployeeNotFoundException() {
		this("Sorry, the employee is not available!");
	}
	
	public EmployeeNotFoundException(String message) {
		this.message = System.currentTimeMillis()+" : "+ message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
