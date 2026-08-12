package com.example.firstspringbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstspringbootproject.entity.Student;
import com.example.firstspringbootproject.repository.StudentRepository;

@RestController
public class DashboardController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/dashboard")
    public DashboardResponse getDashboard() {

        long studentCount = studentRepository.count();

        long courseCount = studentRepository.countCourses();

        List<Student> students = studentRepository.findAll();

        return new DashboardResponse(
                studentCount,
                courseCount,
                students
        );
    }
}


class DashboardResponse {

    private long students;
    private long courses;
    private List<Student> recentStudents;

    public DashboardResponse(
            long students,
            long courses,
            List<Student> recentStudents) {

        this.students = students;
        this.courses = courses;
        this.recentStudents = recentStudents;
    }

    public long getStudents() {
        return students;
    }

    public long getCourses() {
        return courses;
    }

    public List<Student> getRecentStudents() {
        return recentStudents;
    }
}