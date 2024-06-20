package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Department;
import com.example.model.Employee;
import com.example.service.DepartmentService;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService, DepartmentService departmentService) {
	    this.employeeService = employeeService;
	    this.departmentService = departmentService;
	    }
	
	public EmployeeController(){
		
	}
	
	@GetMapping
	public List<Employee> getEmployee() {
		
		return employeeService.getAllEmployee();
	}
	
	 @PostMapping
	    public Employee addEmployee(@RequestBody Employee employee) {
	        return employeeService.addEmployee(employee);
	    }
}
