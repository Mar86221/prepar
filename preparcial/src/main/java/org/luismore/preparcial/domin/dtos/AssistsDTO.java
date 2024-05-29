package org.luismore.preparcial.domin.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class AssistsDTO {
    private UUID id;
    private Integer userId;
    private Integer courseId;
}
