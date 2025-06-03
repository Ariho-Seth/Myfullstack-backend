package com.ariho.fullstack_backend.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class UserNotFoundAdvise {

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler
    public Map<String, String> handleException(UserNotFoundException exception){
        Map<String, String> errorMap =new HashMap<>();
        errorMap.put("Error message", exception.getMessage());
        return errorMap;
    }
}
