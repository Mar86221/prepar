package org.luismore.preparcial.domin.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class CourseDTO {
    private UUID id;
    private String name;
    private String description;
}
