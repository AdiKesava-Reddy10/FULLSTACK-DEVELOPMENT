package com.example.repository;

import com.example.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository repo;

    @Test
    void testSaveAndFind() {
        Student s = new Student("Alice", "CSE", 20);
        repo.save(s);

        List<Student> list = repo.findAll();

        assertFalse(list.isEmpty());
        assertEquals("Alice", list.get(0).getName());
    }
}
