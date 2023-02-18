package com.spring.security.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok().body("Hello there user");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> sayBye(){
        return ResponseEntity.ok().body("Good bye user");
    }
    
    

}
