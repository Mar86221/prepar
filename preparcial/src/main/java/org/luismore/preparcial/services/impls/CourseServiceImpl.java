package org.luismore.preparcial.services.impls;

import jakarta.transaction.Transactional;
import org.luismore.preparcial.domin.entities.Course;
import org.luismore.preparcial.repositories.CourseRepository;
import org.luismore.preparcial.services.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;


    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

}
