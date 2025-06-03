package com.ariho.fullstack_backend.Exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(long id){
        super("Cound not find user "+ id);
    }
}
