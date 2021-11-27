package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class PizzaOrderTestSuite {

    private PizzaOrder pizzaOrder;

    @Test
    public void basePizzaOrder(){
        pizzaOrder = new BasicPizzaOrder();
        System.out.println("Pizza price: "+pizzaOrder.getCost()+" Ingredients: "+ pizzaOrder.getDescription());
        Assertions.assertEquals(new BigDecimal("15"), pizzaOrder.getCost());
        Assertions.assertEquals("Pizza + tomato sauce + cheese", pizzaOrder.getDescription());
    }
    @Test
    public void pizzaOrderWithOneAdditionalIngredients(){
        pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        System.out.println("Pizza price: "+pizzaOrder.getCost()+" Ingredients: "+ pizzaOrder.getDescription());
        Assertions.assertEquals(new BigDecimal("18"), pizzaOrder.getCost());
        Assertions.assertEquals("Pizza + tomato sauce + cheese + extra cheese", pizzaOrder.getDescription());
    }
    @Test
    public void pizzaOrderWithThreeAdditionalIngredients(){
        pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new CornDecorator(pizzaOrder);
        pizzaOrder = new MeatDecorator(pizzaOrder);
        System.out.println("Pizza price: "+pizzaOrder.getCost()+" Ingredients: "+ pizzaOrder.getDescription());
        Assertions.assertEquals(new BigDecimal("24"), pizzaOrder.getCost());
        Assertions.assertEquals("Pizza + tomato sauce + cheese + extra cheese + corn + meat", pizzaOrder.getDescription());
    }
    @Test
    public void pizzaOrderWithAllAdditionalIngredients(){
        pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new CornDecorator(pizzaOrder);
        pizzaOrder = new MeatDecorator(pizzaOrder);
        pizzaOrder = new PepperDecorator(pizzaOrder);
        pizzaOrder = new OrderToGoDecorator(pizzaOrder);
        pizzaOrder = new TomatoDecorator(pizzaOrder);
        System.out.println("Pizza price: "+pizzaOrder.getCost()+" Ingredients: "+ pizzaOrder.getDescription());
        Assertions.assertEquals(new BigDecimal("30"), pizzaOrder.getCost());
        Assertions.assertEquals("Pizza + tomato sauce + cheese + " +
                        "extra cheese + corn + meat + pepper + order to go + tomato"
                        , pizzaOrder.getDescription());
    }
}
