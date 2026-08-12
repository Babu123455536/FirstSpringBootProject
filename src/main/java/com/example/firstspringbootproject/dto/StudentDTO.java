package com.example.firstspringbootproject.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentDTO {

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 3, max = 30,
          message = "Name should be between 3 and 30 characters")
    private String name;

    @NotBlank(message = "Course cannot be empty")
    private String course;

    public StudentDTO() {
    }

    public StudentDTO(String name, String course) {
        this.name = name;
        this.course = course;
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