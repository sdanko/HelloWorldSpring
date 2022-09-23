package com.example.helloworld;

public class HelloWorld {
    private String message;

    public HelloWorld() {
        System.out.println("HelloWorld instance created");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println(message);
    }
}
