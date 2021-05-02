package com.jpaPrac.jpademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("first")
public class RestContrl {

    @GetMapping("msg")
    public String getVal(){
        return "Hello";
    }
}
