package com.ariho.fullstack_backend.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super("Could not find user with id " + id);
    }
}
