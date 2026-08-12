package com.example.firstspringbootproject.mapper;

import org.springframework.stereotype.Component;

import com.example.firstspringbootproject.dto.StudentDTO;
import com.example.firstspringbootproject.dto.StudentResponseDTO;
import com.example.firstspringbootproject.entity.Student;

@Component
public class StudentMapper {

    // StudentDTO → Student Entity
    public Student toEntity(StudentDTO dto) {

        Student student = new Student();

        student.setName(dto.getName());
        student.setCourse(dto.getCourse());

        return student;
    }

    // Student Entity → StudentResponseDTO
    public StudentResponseDTO toResponseDTO(Student student) {

        return new StudentResponseDTO(
                student.getId(),
                student.getName(),
                student.getCourse()
        );
    }
}