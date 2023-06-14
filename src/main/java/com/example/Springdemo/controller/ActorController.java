package com.example.Springdemo.controller;

import com.example.Springdemo.model.Actor;
import com.example.Springdemo.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    ActorService actorService;

    @GetMapping("/all")
    public List<Actor> getAllActors(){
        return actorService.getAllActors();
    }
}
