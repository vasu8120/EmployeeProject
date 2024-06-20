package com.example.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int salary;
	private Timestamp dateOfJoining;
	//private Department department;
	@ManyToOne
	@JoinColumn(name = "department_id", referencedColumnName = "id")
	private Department department;
	
	public Employee(int id2, int salary2, String dateOfJoining2, Department department) {
		// TODO Auto-generated constructor stub
	}
	
	public Employee() {
		
	}
	
	public Department getDept() {
		return department;
	}
	public void setDept(Department dept) {
		this.department = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Timestamp getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Timestamp dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}
