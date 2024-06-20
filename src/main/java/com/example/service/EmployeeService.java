package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.EmployeeRepository;
import com.example.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> l1= employeeRepository.findAll();
		
		return modifiedEmployee(l1);
	}

	private List<Employee> modifiedEmployee(List<Employee> l1) {
		// TODO Auto-generated method stub
		return l1.stream().filter(i-> i.getId()<100).toList();
	}

	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		employeeRepository.save(emp);
		
	}

	 public Employee addEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

}
