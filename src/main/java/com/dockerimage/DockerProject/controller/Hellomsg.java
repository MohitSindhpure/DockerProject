package com.dockerimage.DockerProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class Hellomsg {

    @GetMapping
    public String hello(){
        return "Hello Mohit";
    }
}
