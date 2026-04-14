package com.example.repository;

import com.example.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    // Custom Query Methods
    List<Student> findByDepartment(String department);

    List<Student> findByAgeGreaterThan(int age);

    List<Student> findByDepartmentAndAge(String department, int age);

    // Pagination
    Page<Student> findByDepartment(String department, Pageable pageable);
}
