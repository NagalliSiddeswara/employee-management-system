package com.ems.employee_management.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.ems.employee_management.entity.Employee;
import com.ems.employee_management.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Add a new employee
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get employee by ID
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Employee not found"));
    
    }

    // Delete employee
    public void deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Employee not found");
        }

        employeeRepository.deleteById(id);
    }
//Update an existing employee
public Employee updateEmployee(Long id, Employee employeeDetails) {

	Employee employee = employeeRepository.findById(id)
	        .orElseThrow(() -> new ResponseStatusException(
	                HttpStatus.NOT_FOUND, "Employee not found"));

 employee.setName(employeeDetails.getName());
 employee.setEmail(employeeDetails.getEmail());
 employee.setDepartment(employeeDetails.getDepartment());
 employee.setSalary(employeeDetails.getSalary());

 return employeeRepository.save(employee);
}
//Search employees by department
public List<Employee> getEmployeesByDepartment(String department) {
 return employeeRepository.findByDepartment(department);
}
}