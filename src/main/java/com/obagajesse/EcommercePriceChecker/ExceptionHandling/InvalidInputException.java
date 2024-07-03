package com.obagajesse.EcommercePriceChecker.ExceptionHandling;

public class InvalidInputException extends RuntimeException{

    public InvalidInputException(String message){
        super(message);
    }
}
