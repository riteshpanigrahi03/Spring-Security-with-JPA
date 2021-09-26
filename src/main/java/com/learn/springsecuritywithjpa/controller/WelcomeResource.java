package com.learn.springsecuritywithjpa.controller;

import com.learn.springsecuritywithjpa.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WelcomeResource {

    @GetMapping("/")
    public String all(){
        return ("<h1>Welcome All</h1>");
    }
    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome User</h1");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin</h1");
    }
}
