package com.bankingsystem.bankingapp.exceptionHandler;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(
            Exception ex,
            HttpServletRequest request) {

        Map<String, Object> errorResponse = new HashMap<>();

        errorResponse.put("timestamp", java.time.LocalDateTime.now());
        errorResponse.put("description:", ex.getMessage());
        errorResponse.put("status", 500);


        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}