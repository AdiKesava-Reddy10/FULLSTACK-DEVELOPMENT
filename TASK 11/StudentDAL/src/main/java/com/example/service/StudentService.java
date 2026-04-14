package com.example.service;

import com.example.model.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    // Save
    public Student save(Student s) {
        return repo.save(s);
    }

    // Get by Department
    public List<Student> getByDepartment(String dept) {
        return repo.findByDepartment(dept);
    }

    // Get by Age > condition
    public List<Student> getByAgeGreater(int age) {
        return repo.findByAgeGreaterThan(age);
    }

    // Combined condition
    public List<Student> getByDeptAndAge(String dept, int age) {
        return repo.findByDepartmentAndAge(dept, age);
    }

    // Sorting
    public List<Student> getSorted(String field) {
        return repo.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    // Pagination
    public Page<Student> getPaginated(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repo.findAll(pageable);
    }

    // Pagination + Condition
    public Page<Student> getDeptPaginated(String dept, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repo.findByDepartment(dept, pageable);
    }
}
