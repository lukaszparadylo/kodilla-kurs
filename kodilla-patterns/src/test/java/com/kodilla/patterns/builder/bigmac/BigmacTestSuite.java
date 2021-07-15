package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    private Bigmac bigmac;

    @Test
    public void ingredientTest(){
            bigmac = new Bigmac.BigmacBuilder()
                    .bun("No Sesame")
                    .sauce("1000 island")
                    .burgers(2)
                    .ingredient(Ingredients.CHEESE)
                    .ingredient(Ingredients.BACON)
                    .ingredient(Ingredients.CUCUMBER)
                    .ingredient(Ingredients.PEPPER_CHILI)
                    .build();
            System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();

        Assertions.assertEquals(4, howManyIngredients);
    }
}
