package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // CREATE
    @PostMapping
    public Student create(@RequestBody Student s) {
        return service.saveStudent(s);
    }

    // READ ALL
    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student update(@PathVariable int id, @RequestBody Student s) {
        return service.updateStudent(id, s);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.deleteStudent(id);
        return "Deleted Successfully";
    }
}
