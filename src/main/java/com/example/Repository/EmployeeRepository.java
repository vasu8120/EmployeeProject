package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;




@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // You can add custom queries here if needed
}
