package com.example.firstspringbootproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @NotBlank(message = "Name cannot be empty")
    @Size(min = 3, max = 50,
          message = "Name must be between 3 and 50 characters")
    private String name;


    @NotBlank(message = "Course cannot be empty")
    private String course;


    // Constructors

    public Student() {

    }


    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }


    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}