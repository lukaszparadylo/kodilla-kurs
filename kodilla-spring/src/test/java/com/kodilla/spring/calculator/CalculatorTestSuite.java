package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations(){
        calculator.add(1,1);
        calculator.sub(1,1);
        calculator.mul(1.5,1.5);
        calculator.div(1,1.5);
    }
}
