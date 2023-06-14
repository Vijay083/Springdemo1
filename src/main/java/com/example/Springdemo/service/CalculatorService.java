package com.example.Springdemo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double division(double first, double second){

        return first/second;
    }
    public double multiplication(double first, double second){

        return first*second;
    }
    public double substraction(double first, double second){

        return first-second;
    }
    public double addition(double first, double second){

        return first+second;
    }
    public double modulus(double first, double second){

        return first%second;
    }
    public double simpleInterest(int principal, int time, double rate){

        return (principal*time*rate)/100.0;
    }
}



