package com.example.controller;

import com.example.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employee")
    public String getEmployee(Model model) {

        // Create employee object (in-memory)
        Employee emp = new Employee(1, "Alice", 50000);

        // Add to model
        model.addAttribute("emp", emp);

        // Return view name
        return "employee";
    }
}
