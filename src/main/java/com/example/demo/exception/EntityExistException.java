package com.example.demo.exception;

public class EntityExistException extends RuntimeException{
    public EntityExistException() {
        super("Data is exist");
    }

    public EntityExistException(String message) {
        super(message);
    }
}

