package org.luismore.preparcial.services;

import org.luismore.preparcial.domin.dtos.CreateCourseDTO;
import org.luismore.preparcial.domin.entities.Course;

import java.util.List;
import java.util.UUID;

public interface CourseService {

    List<Course> findAllCourses();
    List<Course> findById();
    List<Course> findByUser();
    List<Course> findByBook();
    Boolean existByName();

    List<Course> getCourseById(UUID id);
    void create(CreateCourseDTO course);

    void deleteCourse(UUID id);
}