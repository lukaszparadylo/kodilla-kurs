package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations(){
        Assertions.assertEquals(2, calculator.add(1,1));
        Assertions.assertEquals(0, calculator.sub(1,1));
        Assertions.assertEquals(2.25, calculator.mul(1.5,1.5));
        Assertions.assertEquals(0.66, calculator.div(1,1.5),0.01);
    }
}
