package com.springjpa_learning.springjpa.controller;

import com.springjpa_learning.springjpa.dto.message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("checking")
public class checking {
    @GetMapping("message")
    public message checking(){
        return new message("Jeffy");
    }
}
