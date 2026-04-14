package com.example.service;

import com.example.model.Student;
import com.example.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Mock
    private StudentRepository repo;

    @InjectMocks
    private StudentService service;

    public StudentServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllStudents() {
        when(repo.findAll()).thenReturn(Arrays.asList(
                new Student("Alice", "CSE", 20),
                new Student("Bob", "ECE", 22)
        ));

        List<Student> students = service.getAllStudents();

        assertEquals(2, students.size());
        verify(repo, times(1)).findAll();
    }

    @Test
    void testSaveStudent() {
        Student s = new Student("Alice", "CSE", 20);

        when(repo.save(s)).thenReturn(s);

        Student saved = service.save(s);

        assertEquals("Alice", saved.getName());
        verify(repo).save(s);
    }
}
