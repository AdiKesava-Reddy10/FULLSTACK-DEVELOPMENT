package com.example.service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void addEmployee(Employee emp) {
        repository.addEmployee(emp);
    }

    public void displayEmployees() {
        List<Employee> list = repository.getAllEmployees();
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
