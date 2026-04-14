package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "course")
    private String course;

    @Column(name = "fee")
    private double fee;

    public Student() {}

    public Student(String name, String course, double fee) {
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public double getFee() { return fee; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCourse(String course) { this.course = course; }
    public void setFee(double fee) { this.fee = fee; }
}
