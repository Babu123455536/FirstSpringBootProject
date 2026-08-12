package com.example.firstspringbootproject.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.firstspringbootproject.dto.StudentRequest;
import com.example.firstspringbootproject.dto.StudentResponseDTO;
import com.example.firstspringbootproject.entity.Student;
import com.example.firstspringbootproject.exception.ResourceNotFoundException;
import com.example.firstspringbootproject.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;


    // GET ALL STUDENTS
    public List<StudentResponseDTO> getAllStudents() {

        return repository.findAll()
                .stream()
                .map(student -> new StudentResponseDTO(
                        student.getId(),
                        student.getName(),
                        student.getCourse()
                ))
                .collect(Collectors.toList());
    }


    // GET STUDENT BY ID
    public StudentResponseDTO getStudentById(int id) {

        Student student = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Student not found with ID : " + id
                        ));

        return new StudentResponseDTO(
                student.getId(),
                student.getName(),
                student.getCourse()
        );
    }


    // CREATE STUDENT
    public StudentResponseDTO saveStudent(StudentRequest request) {

        Student student = new Student();

        student.setName(request.getName());
        student.setCourse(request.getCourse());

        Student savedStudent = repository.save(student);

        return new StudentResponseDTO(
                savedStudent.getId(),
                savedStudent.getName(),
                savedStudent.getCourse()
        );
    }


    // UPDATE STUDENT
    public StudentResponseDTO updateStudent(
            int id,
            StudentRequest request) {

        Student student = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Student not found with ID : " + id
                        ));

        student.setName(request.getName());
        student.setCourse(request.getCourse());

        Student updatedStudent = repository.save(student);

        return new StudentResponseDTO(
                updatedStudent.getId(),
                updatedStudent.getName(),
                updatedStudent.getCourse()
        );
    }


    // DELETE STUDENT
    public String deleteStudent(int id) {

        Student student = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Student not found with ID : " + id
                        ));

        repository.delete(student);

        return "Student Deleted Successfully";
    }


    // SEARCH STUDENTS BY NAME
    public List<StudentResponseDTO> searchStudentsByName(String name) {

        return repository.findByNameContaining(name)
                .stream()
                .map(student -> new StudentResponseDTO(
                        student.getId(),
                        student.getName(),
                        student.getCourse()
                ))
                .collect(Collectors.toList());
    }


    // SEARCH STUDENTS BY COURSE
    public List<StudentResponseDTO> searchStudentsByCourse(String course) {

        return repository.findByCourse(course)
                .stream()
                .map(student -> new StudentResponseDTO(
                        student.getId(),
                        student.getName(),
                        student.getCourse()
                ))
                .collect(Collectors.toList());
    }


    // PAGINATION
    public Page<StudentResponseDTO> getStudentsWithPagination(
            Pageable pageable) {

        return repository.findAll(pageable)
                .map(student -> new StudentResponseDTO(
                        student.getId(),
                        student.getName(),
                        student.getCourse()
                ));
    }


    // FILTER + PAGINATION + SORTING
    public Page<StudentResponseDTO> filterStudents(
            String name,
            Pageable pageable) {

        return repository.findByNameContaining(name, pageable)
                .map(student -> new StudentResponseDTO(
                        student.getId(),
                        student.getName(),
                        student.getCourse()
                ));
    }


    // FILTER BY NAME + COURSE
    public Page<StudentResponseDTO> filterByNameAndCourse(
            String name,
            String course,
            Pageable pageable) {

        return repository.findByNameAndCourse(
                name,
                course,
                pageable
        ).map(student -> new StudentResponseDTO(
                student.getId(),
                student.getName(),
                student.getCourse()
        ));
    }
}