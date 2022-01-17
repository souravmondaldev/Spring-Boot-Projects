package com.thebetterdeveloper.course2;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MessageService {
    private String message;

    public MessageService(String message) {
        this.message = message;
    }

    public String lowerCase() {
        return this.message.toLowerCase();
    }

    public String upperCase() {
        return this.message.toUpperCase();
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating MessageService Bean");
    }
}
