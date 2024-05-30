package org.luismore.preparcial.repositories;

import org.luismore.preparcial.domin.entities.Course;
import org.luismore.preparcial.domin.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
    List<Course> findAllById_course(UUID id);
    List<Course> findAllByUser(User user);
    List<Course> findAllByName(String name);
    Boolean existsByName(String name);
    void deleteByName(String name);
     void deleteById_course(UUID id);}



