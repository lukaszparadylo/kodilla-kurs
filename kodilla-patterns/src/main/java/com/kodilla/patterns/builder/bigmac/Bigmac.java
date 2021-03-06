package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final Integer burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder{
        private String bun;
        private Integer burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }
        public BigmacBuilder burgers(Integer burgers){
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build(){
            if(bun==null){
                throw new IllegalStateException("There is no bun");
            }
            if (burgers<=0){
                throw new IllegalStateException("There is no burger");
            }
            if (ingredients.size()==0){
                throw new IllegalStateException("There is no ingredients");
            }
            return new Bigmac(bun,burgers,sauce,ingredients);
        }
    }

    private Bigmac(String bun, Integer burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
