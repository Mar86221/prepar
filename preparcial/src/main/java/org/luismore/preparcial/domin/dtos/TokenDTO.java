package org.luismore.preparcial.domin.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.luismore.preparcial.domin.entities.Token;

@Data
@NoArgsConstructor
public class TokenDTO {
    private String token;

    public TokenDTO(Token token){
        this.token = token.getContent();
    }
}
