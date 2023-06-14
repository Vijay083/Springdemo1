package com.example.Springdemo.controller;

import com.example.Springdemo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculateController {

    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/divide/{first}/{second}")
    public ResponseEntity<Object> division(@PathVariable("first") double first, @PathVariable("second") double second){
        if(second ==0){
            return new ResponseEntity<>("Second Value is Zero and Division operation cannot be performed", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(calculatorService.division(first,second),HttpStatus.OK);
    }
    @GetMapping("/multiply/{first}/{second}")
    public ResponseEntity<Object> multiplication(@PathVariable("first") double first, @PathVariable("second") double second){

        return new ResponseEntity<>(calculatorService.multiplication(first,second),HttpStatus.OK);
    }
    @GetMapping("/subtract/{first}/{second}")
    public ResponseEntity<Object> substraction(@PathVariable("first") double first, @PathVariable("second") double second){

        return new ResponseEntity<>(calculatorService.substraction(first,second),HttpStatus.OK);
    }
    @GetMapping("/add/{first}/{second}")
    public ResponseEntity<Object> addition(@PathVariable("first") double first, @PathVariable("second") double second){

        return new ResponseEntity<>(calculatorService.addition(first,second),HttpStatus.OK);
    }
    @GetMapping("/modulus/{first}/{second}")
    public ResponseEntity<Object> modulus(@PathVariable("first") double first, @PathVariable("second") double second){

        if(second ==0){
            return new ResponseEntity<>("Second Value is Zero and Modulus operation cannot be performed", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(calculatorService.modulus(first,second),HttpStatus.OK);
    }

    @GetMapping("/simpleInterest/{principal}/{time}{interest}")
    public ResponseEntity<Object> simpleInterest(@PathVariable("principal") int principal, @PathVariable("time") int time, @PathVariable("rate") double rate){
        if(principal ==0 || time == 0 || rate ==0){
            return new ResponseEntity<>("Principal or time or rate can't be Zero and simple interest operation cannot be performed", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(calculatorService.simpleInterest(principal,time,rate),HttpStatus.OK);
    }
}
