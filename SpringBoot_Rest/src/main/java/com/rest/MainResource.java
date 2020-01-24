package com.rest;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainResource 
{
	@RequestMapping("employees")  //whenever this app gets a request for employees
	public List<Employee> getEmployees()
	{
		List<Employee> employees = new ArrayList<>();
		
		Employee a1 = new Employee();	//Hardwired employee information in case if H2 database doesnt work
		a1.setId(1);
		a1.setName("Ace");
		a1.setPoints(95);
		
		Employee a2 = new Employee();
		a2.setId(2);
		a2.setName("Henry");
		a2.setPoints(97);
		
		Employee a3 = new Employee();
		a3.setId(3);
		a3.setName("Ron");
		a3.setPoints(92);
		
		Employee a4 = new Employee();
		a4.setId(4);
		a4.setName("Mark");
		a4.setPoints(85);
		
		employees.add(a1);
		employees.add(a2);
		employees.add(a3);
		employees.add(a4);
		
		return employees;		
	}
	
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("employeesdb")  //whenever this app gets a request for employees
	public List<Employee> getEmployeesdb()
	{
		List<Employee> employees = (List<Employee>) repo.findAll();
		return employees;		
	}
}
