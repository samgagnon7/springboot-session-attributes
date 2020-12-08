package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

@RestController
public class NewSessionAttibuteController {

    @GetMapping("/cart")
    public String cart(@SessionAttribute("sessionString") String sessionString, final Model model) {

        return "Variable:" + sessionString;
    }
}