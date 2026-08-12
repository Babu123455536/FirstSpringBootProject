package com.example.firstspringbootproject.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentRequest {

    @NotBlank(message = "Student name is required")
    @Size(min = 2, max = 100,
          message = "Student name must be between 2 and 100 characters")
    private String name;


    @NotBlank(message = "Course is required")
    @Size(min = 2, max = 100,
          message = "Course must be between 2 and 100 characters")
    private String course;


    // Getter
    public String getName() {
        return name;
    }


    // Setter
    public void setName(String name) {
        this.name = name;
    }


    // Getter
    public String getCourse() {
        return course;
    }


    // Setter
    public void setCourse(String course) {
        this.course = course;
    }

}