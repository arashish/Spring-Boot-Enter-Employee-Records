package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public String home() 
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addEmployee") //when user clicks the submit button
	public String addEmployee(Employee employee) 
	{
		repo.save(employee); //stores it in the database
		return "home.jsp";
	}
}
