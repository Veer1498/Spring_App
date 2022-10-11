package com.firstspringapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    @RequestMapping("/")
    public String index() {
        return "Hello From BridgeLabz";
    }
}
