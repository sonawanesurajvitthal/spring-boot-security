package com.spring.security.exception;

public class UserAlreadyExistException extends RuntimeException{

    public UserAlreadyExistException(){
        super("User Exist");
    }

    public UserAlreadyExistException(String message){
        super(message);
    }
}
