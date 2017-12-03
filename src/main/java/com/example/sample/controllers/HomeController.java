package com.example.sample.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    
    @GetMapping("/user")
    public User getUser(){
        return new User("Sahil","18"); 
    }
    
    public static class User{
        public String name;
        public String age;
        
        public User(String name,String age){
            this.name = name;
            this.age = age; 
        }
    }
    
}
