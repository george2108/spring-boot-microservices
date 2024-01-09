package com.microservice.course.client;

import com.microservice.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        name = "msvc-student-service",
        url = "localhost:8090/api/v1/students"
)
public interface StudentClient {
    @GetMapping("/search-by-course/{courseId}")
    List<StudentDTO> findAllStudentsByCourse(
            @PathVariable Long courseId
    );
}
