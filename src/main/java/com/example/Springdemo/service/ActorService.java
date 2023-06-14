package com.example.Springdemo.service;

import com.example.Springdemo.model.Actor;
import com.example.Springdemo.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    ActorRepository actorRepository;

    public List<Actor> getAllActors(){
        return actorRepository.findAll();
    }
}
