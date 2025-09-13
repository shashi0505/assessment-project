package com.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AssessmentController {

    @GetMapping("msg")
    public String getAssessment (){
        return "This is my first Assessment";
    }

    @GetMapping("hello")
    public String Hello(){
        return "Hello Worlds";
    }
}
