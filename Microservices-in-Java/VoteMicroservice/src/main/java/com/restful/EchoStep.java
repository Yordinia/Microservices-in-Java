package com.restful;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("EchoStep")
public class EchoStep extends Step{
    private String message = "Greetings ! Welcome to this Vote Flow thingy!";
    @Override
    public String execute() {
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
