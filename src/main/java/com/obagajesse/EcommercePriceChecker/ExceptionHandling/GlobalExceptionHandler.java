package com.obagajesse.EcommercePriceChecker.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    public ResponseEntity<CustomErrorResponse> handleInvalidInput(InvalidInputException ex){
        CustomErrorResponse errorResponse = new CustomErrorResponse(405,"Invalid input");
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<CustomErrorResponse> handleResourceNotFound(ResourceNotFoundException ex){
        CustomErrorResponse errorResponse = new CustomErrorResponse(404,"Resource not found");
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
