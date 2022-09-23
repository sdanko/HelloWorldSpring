package com.example.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    public HelloWorldConfig() {
        System.out.println("Creating HelloWorldConfig");
    }

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

    @Bean
    public HelloWorldConsumer helloWorldConsumer() {
        return new HelloWorldConsumer(helloWorld());
    }
}
