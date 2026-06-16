package com.example.demo2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // This annotation allows this class to handle exceptions globally across all controllers in the application
public class GlobalExceptionHandler {

    @ExceptionHandler (TaskNotFoundException.class)
    public ResponseEntity<String> handleTaskNotFoundException(TaskNotFoundException ex) {
        
        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(ex.getMessage());
    }
}

//the handletasknotfoundexception basically gets the message from taskservice and then returns that along with a status code showing that the server could not find the task. This is a good practice to have a global exception handler so that we can handle all exceptions in one place and return appropriate responses to the client.