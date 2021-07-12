package com.kodilla.spring.calculator;

import org.springframework.stereotype.Repository;

@Repository
public class Display {
    void displayValue(double val){
        System.out.println("Calculation Result: " + val);
    }
}
