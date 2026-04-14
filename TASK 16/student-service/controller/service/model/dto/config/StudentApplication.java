package com.example.student.model;

public class Student {

    private int id;
    private String name;
    private int courseId;

    public Student(int id, String name, int courseId) {
        this.id = id;
        this.name = name;
        this.courseId = courseId;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getCourseId() { return courseId; }
}
