package com.microservice.student.services;

import com.microservice.student.entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    Student findById(Long id);

    Student save(Student student);

    void deleteById(Long id);

    List<Student> findAllByCourseId(Long courseId);
}
