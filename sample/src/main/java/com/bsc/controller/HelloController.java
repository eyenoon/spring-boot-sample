package com.bsc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String helloSampleWorld(){
        return "Hello, Sample World!!";
    }
}
