package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Repository.DepartmentRepository;
import com.example.model.Department;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Create operation
    @Transactional
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Read operation
    public Department getDepartmentById(Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        if (department.isPresent()) {
            return department.get();
        } else {
            throw new RuntimeException("Department not found with id: " + id);
        }
    }

    // Read all departments
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Update operation
    @Transactional
    public Department updateDepartment(Long id, Department updatedDepartment) {
        Department department = getDepartmentById(id);
        department.setName(updatedDepartment.getName());
        // You can add more fields here if needed
        return departmentRepository.save(department);
    }

    // Delete operation
    @Transactional
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
