package com.example.jokeApp.controllers;

import com.example.jokeApp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping (value  = {"/",""})
    public String getAJoke (Model model){
        model.addAttribute("joke",jokeService.getAJoke());
        return "chucknorris";
    }
}
