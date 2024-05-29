package org.luismore.preparcial.services;

import org.luismore.preparcial.domin.dtos.UserRegisterDTO;
import org.luismore.preparcial.domin.entities.Token;
import org.luismore.preparcial.domin.entities.User;

public interface UserService {
    void create(UserRegisterDTO info);
    User findByUsernameOrEmail(String username, String email);
    User findByIdentifier(String identifier);
    boolean checkPassword(User user, String password);
    boolean isActive(User username);
    void toggleEnable(String username);
    Token registerToken(User user) throws Exception;
    Boolean isTokenValid(User user, String token);
    void cleanTokens(User user) throws Exception;
    User findUserAuthenticated();
    void updatePassword(String identifier, String newPassword);

}