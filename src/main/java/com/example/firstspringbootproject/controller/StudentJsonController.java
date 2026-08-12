package com.example.firstspringbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import com.example.firstspringbootproject.dto.StudentRequest;
import com.example.firstspringbootproject.dto.StudentResponseDTO;
import com.example.firstspringbootproject.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentJsonController {

    @Autowired
    private StudentService studentService;


    // =====================================
    // GET ALL STUDENTS
    // =====================================

    @GetMapping
    public List<StudentResponseDTO> getAllStudents() {

        return studentService.getAllStudents();

    }


    // =====================================
    // GET STUDENT BY ID
    // =====================================

    @GetMapping("/{id}")
    public StudentResponseDTO getStudentById(
            @PathVariable int id) {

        return studentService.getStudentById(id);

    }


    // =====================================
    // SEARCH STUDENTS BY NAME
    // =====================================

    @GetMapping("/search")
    public List<StudentResponseDTO> searchStudents(
            @RequestParam String name) {

        return studentService.searchStudentsByName(name);

    }


    // =====================================
    // ADD STUDENT
    // =====================================

    @PostMapping
    public StudentResponseDTO addStudent(
            @Valid @RequestBody StudentRequest request) {

        return studentService.saveStudent(request);

    }


    // =====================================
    // UPDATE STUDENT
    // =====================================

    @PutMapping("/{id}")
    public StudentResponseDTO updateStudent(
            @PathVariable int id,
            @Valid @RequestBody StudentRequest request) {

        return studentService.updateStudent(
                id,
                request
        );

    }


    // =====================================
    // DELETE STUDENT
    // =====================================

    @DeleteMapping("/{id}")
    public String deleteStudent(
            @PathVariable int id) {

        return studentService.deleteStudent(id);

    }

}