package com.microservice.course.services;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentsByCourseResponse;

import java.util.List;

public interface ICourseService {
    List<Course> findAll();

    Course findById(Long id);

    Course save(Course course);

    void deleteById(Long id);

    StudentsByCourseResponse findStudentsByCourseId(Long id);
}
