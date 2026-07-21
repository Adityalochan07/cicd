package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailsController {
    @Autowired
    private OrderDetailsService service;

    @GetMapping("/orderdetails")
    public List<Orderdetails> list() {
        return service.listAll();
    }
     @GetMapping("/yo")
public String hello() {
    return "Hello";
}

     @GetMapping("/honey")
public String hellWorld() {
    return "Hello World";
}

     @GetMapping("/honey-singh")
public String hellWorld1() {
    return "Hello World";
}
    
}
