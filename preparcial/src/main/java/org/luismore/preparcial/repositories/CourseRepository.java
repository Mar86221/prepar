package org.luismore.preparcial.repositories;

import org.luismore.preparcial.domin.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
}