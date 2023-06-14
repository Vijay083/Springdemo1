package com.example.Springdemo.repository;

import com.example.Springdemo.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Integer> {

}
