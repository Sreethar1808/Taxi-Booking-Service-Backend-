package com.example.RideIT.exception;

public class CabNotFoundException extends RuntimeException{

    public CabNotFoundException(String message)
    {
        super(message);
    }
}
