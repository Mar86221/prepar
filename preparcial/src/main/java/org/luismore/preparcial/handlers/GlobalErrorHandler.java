package org.luismore.preparcial.handlers;

import jakarta.persistence.NonUniqueResultException;
import org.luismore.preparcial.domin.dtos.GeneralResponse;
import org.luismore.preparcial.utils.ErrorTools;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

public class GlobalErrorHandler {
    private final ErrorTools errorsTool;

    public GlobalErrorHandler(ErrorTools errorsTool) {this.errorsTool = errorsTool;}

    @ExceptionHandler(Exception.class)
    public ResponseEntity<GeneralResponse> GeneralHandler(Exception ex) {
        return GeneralResponse.getResponse(HttpStatus.CONFLICT, ex.getMessage());
    }

    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<GeneralResponse> ResourceNotFoundHandler(NoResourceFoundException ex){
        return GeneralResponse.getResponse(HttpStatus.NOT_FOUND, ex.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<GeneralResponse> IllegalArgumentHandler(IllegalArgumentException ex){
        return GeneralResponse.getResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<GeneralResponse> IllegalStateHandler(IllegalStateException ex){
        return GeneralResponse.getResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(HttpClientErrorException.Forbidden.class)
    public ResponseEntity<GeneralResponse> forbiddenException(HttpClientErrorException.Forbidden ex){
        return GeneralResponse.getResponse(HttpStatus.FORBIDDEN, ex.getMessage());
    }

    @ExceptionHandler(HttpClientErrorException.Unauthorized.class)
    public ResponseEntity<GeneralResponse> unauthorizedException(HttpClientErrorException.Unauthorized ex){
        return GeneralResponse.getResponse(HttpStatus.UNAUTHORIZED, ex.getMessage());
    }

    @ExceptionHandler(InternalError.class)
    public ResponseEntity<GeneralResponse> internalErrorHandler(InternalError ex){
        return GeneralResponse.getResponse(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }

}
