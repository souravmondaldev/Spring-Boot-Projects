package com.thebetterdeveloper.mvcBasics.controller;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Service
public class MessageListService {
    private List<String> messages;

    @PostConstruct
    public void postConstruct(){
        this.messages= new ArrayList<>();
    }
    public void addMessage(String message){
        messages.add(message);
    }
    public List<String> getMessages() {
        return messages;
    }
}
