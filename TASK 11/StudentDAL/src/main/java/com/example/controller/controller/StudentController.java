package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // Create
    @PostMapping
    public Student add(@RequestBody Student s) {
        return service.save(s);
    }

    // By Department
    @GetMapping("/dept/{dept}")
    public List<Student> byDept(@PathVariable String dept) {
        return service.getByDepartment(dept);
    }

    // Age > condition
    @GetMapping("/age/{age}")
    public List<Student> byAge(@PathVariable int age) {
        return service.getByAgeGreater(age);
    }

    // Combined
    @GetMapping("/filter")
    public List<Student> filter(@RequestParam String dept, @RequestParam int age) {
        return service.getByDeptAndAge(dept, age);
    }

    // Sorting
    @GetMapping("/sort/{field}")
    public List<Student> sort(@PathVariable String field) {
        return service.getSorted(field);
    }

    // Pagination
    @GetMapping("/page")
    public Page<Student> page(@RequestParam int page, @RequestParam int size) {
        return service.getPaginated(page, size);
    }

    // Pagination + Condition
    @GetMapping("/dept-page")
    public Page<Student> deptPage(@RequestParam String dept,
                                 @RequestParam int page,
                                 @RequestParam int size) {
        return service.getDeptPaginated(dept, page, size);
    }
}
