package com.example.cocktails.model;

public class Ingredient {
    private String ingredientName;
    private boolean isAllergen;

    public Ingredient(String name, boolean isAllergen){
        this.ingredientName = name;
        this.isAllergen = isAllergen;
    }

    public String getIngredientName(){
        return ingredientName;
    }

    public boolean isAllergen(){
        return isAllergen;
    }

}
