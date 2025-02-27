package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Course;
import com.texas.Miniproject.entity.Department;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Course saveCourse(Course course);

    List<Course> listAllCourse();

    Optional<Course> getCourseById(Long id);
}
