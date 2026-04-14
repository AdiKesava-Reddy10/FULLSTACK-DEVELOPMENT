package com.example.course.model;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String instructor;

    public Course() {}

    public Course(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getInstructor() { return instructor; }
}
