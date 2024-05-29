package org.luismore.preparcial.repositories;

import org.luismore.preparcial.domin.entities.Token;
import org.luismore.preparcial.domin.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TokenRepository extends JpaRepository<Token, UUID> {

    List<Token> findByUserAndActive(User user, Boolean active);
}
