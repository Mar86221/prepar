package org.luismore.preparcial.domin.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class UserDTO {
    private UUID id;
    private String name;
    private String email;
    private String password;
}
