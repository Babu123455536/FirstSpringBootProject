package com.example.firstspringbootproject.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.firstspringbootproject.entity.Student;

public interface StudentRepository
        extends JpaRepository<Student, Integer> {

    // Search by course
    List<Student> findByCourse(String course);

    // Search by name
    List<Student> findByNameContaining(String name);

    // Search by name with pagination
    Page<Student> findByNameContaining(
            String name,
            Pageable pageable
    );

    // Search by name and course with pagination
    Page<Student> findByNameAndCourse(
            String name,
            String course,
            Pageable pageable
    );

    // Count distinct courses
    @Query("SELECT COUNT(DISTINCT s.course) FROM Student s")
    long countCourses();

}