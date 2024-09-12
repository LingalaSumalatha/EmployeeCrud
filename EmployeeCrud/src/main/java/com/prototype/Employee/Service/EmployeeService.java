package com.prototype.Employee.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prototype.Employee.Model.Employee;
import com.prototype.Employee.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Create a new employee
    public Employee createEmployee(Employee employee) {
        return (Employee) employeeRepository.save(employee);
    }

    // Retrieve all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Retrieve employee by ID
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(null);  // Or throw an exception if preferred
    }

    // Update employee details
    public Employee updateEmployee(Long id, Employee employee) {
        if (employeeRepository.existsById(id)) {
            employee.setId(id);  // Ensure ID is set for update
            return (Employee) employeeRepository.save(employee);
        }
        return null;  // Or throw an exception if preferred
    }

    // Delete employee by ID
    public void deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
        } else {
            // Handle case where ID does not exist
            // You could throw an exception or return a response indicating failure
        }
    }
}
