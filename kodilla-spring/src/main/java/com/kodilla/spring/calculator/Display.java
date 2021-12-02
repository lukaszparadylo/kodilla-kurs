package com.kodilla.spring.calculator;

import org.springframework.stereotype.Repository;

@Repository
public class Display {
    double displayValue(double val){
        System.out.println("Calculation Result: " + val);
        return val;
    }
}
