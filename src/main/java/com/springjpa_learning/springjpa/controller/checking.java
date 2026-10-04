package com.springjpa_learning.springjpa.controller;

import com.springjpa_learning.springjpa.dto.User;
import com.springjpa_learning.springjpa.dto.message;
import com.springjpa_learning.springjpa.service.CheckingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("checking")
public class checking {

    private final CheckingService checkingService;

    public checking(CheckingService checkingService) {
        this.checkingService = checkingService;
    }

    @GetMapping("message")
    public message checking(){
        return new message("Jeffy");
    }
    @PostMapping("/addUser")
    public ResponseEntity<message> addUser(@RequestBody User user){
        checkingService.addUser(user);
        return new ResponseEntity<>(new message("Value Saved") , HttpStatus.OK);
    }
}
