package org.luismore.preparcial.domin.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateCourseDTO {
    @NotNull
    private String name;
    @NotNull
    private String username;
}
