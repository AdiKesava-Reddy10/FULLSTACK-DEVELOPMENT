package com.example;

import com.example.config.AppConfig;
import com.example.model.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // Create BeanFactory using Annotation Configuration
        BeanFactory factory = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get EmployeeService bean
        EmployeeService service = factory.getBean(EmployeeService.class);

        // Add Employees
        service.addEmployee(new Employee(1, "Alice", 50000));
        service.addEmployee(new Employee(2, "Bob", 60000));

        // Display Employees
        service.displayEmployees();
    }
}
