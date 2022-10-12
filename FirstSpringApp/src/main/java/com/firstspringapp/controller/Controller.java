package com.firstspringapp.controller;

import com.firstspringapp.model.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @RequestMapping("/api")
    public String Hello() {
        return "<h1>Hello From BridgeLabz!!</h1>";
    }

    @GetMapping("/query")
    public String getUsers(@RequestParam(value = "name", defaultValue = "Veer") String name){
        return "<h1><font color=blue>Hello! " + name + " From BridgeLabz!!</font></h1>" +
                "</br> <font color=green>Passing name as a parameter.</font>";
    }

    @RequestMapping(value = {"/query/{name}"}, method = RequestMethod.GET)
    public String greet(@PathVariable String name) {
        return "<h1><font color=green>Hello! " + name + " From BridgeLabz!!</font></h1>" +
                "</br> <font color=purple>Passing name as a path variable.</font>";
    }
    @PostMapping("/post")
    public String post(@RequestBody Model model) {
        return "Hello " + model.getFirstName() + " "+  model.getLastName() + "!";
    }
    @PutMapping("/put/{firstName}")
    public String put(@PathVariable String firstName,
                      @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
