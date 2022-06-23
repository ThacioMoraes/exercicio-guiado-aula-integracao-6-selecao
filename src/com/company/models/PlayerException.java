package com.company.models;

public class PlayerException extends RuntimeException{

    public PlayerException(){
        super();
    }

    public PlayerException(String message){
        super(message);
    }
}
