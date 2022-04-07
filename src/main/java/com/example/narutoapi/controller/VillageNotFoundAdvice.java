package com.example.narutoapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class VillageNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(VillageNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String shinobiNotFoundHandler(VillageNotFoundException ex) {
        return ex.getMessage();
    }
}
