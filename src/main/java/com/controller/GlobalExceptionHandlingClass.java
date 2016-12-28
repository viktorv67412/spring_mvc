package com.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlingClass {

    @ExceptionHandler(value = Exception.class)
    public String unknownExceptionHandler(Exception e) {
        e.printStackTrace();
        return "unknownEx";
    }

    @ExceptionHandler(value = NullPointerException.class)
    public String handleNullPointerException(Exception e){
        e.printStackTrace();
        return "nullPointerEx";
    }
}
