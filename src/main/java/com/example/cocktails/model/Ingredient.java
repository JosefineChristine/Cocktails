package com.example.cocktails.model;

public class Ingredient {
    private String name;
    private boolean isAllergen;

    public Ingredient(String name, boolean isAllergen){
        this.name = name;
        this.isAllergen = isAllergen;
    }

}
