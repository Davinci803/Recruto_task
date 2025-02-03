package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String hello(@RequestParam(defaultValue = "Recruto") String name,
                        @RequestParam(defaultValue = "Давай дружить") String message) {
        return "Hello " + name + "! " + message;
    }
}
