package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String department;

    @Column
    private int age;

    public Student() {}

    public Student(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getAge() { return age; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setAge(int age) { this.age = age; }
}
