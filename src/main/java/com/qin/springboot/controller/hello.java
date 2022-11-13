package com.qin.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

//    @RequestMapping()
    @GetMapping("/h1")
    public String hello(){
        return "hello springboot";
    }
}
