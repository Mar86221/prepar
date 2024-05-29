package org.luismore.preparcial.services;

import org.luismore.preparcial.domin.entities.Course;

import java.util.List;
import java.util.UUID;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(UUID id);
    Course createCourse(Course course);
    Course updateCourse(UUID id, Course course);
    void deleteCourse(UUID id);
}