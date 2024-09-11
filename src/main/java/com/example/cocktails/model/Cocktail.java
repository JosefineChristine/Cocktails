package com.example.cocktails.model;
import com.example.cocktails.controller.CocktailController;
import java.util.ArrayList;
import java.util.List;

public class Cocktail {
    private String name;
    private List<Ingredient> ingredients = new ArrayList<>();

    public Cocktail(String name, List<Ingredient> ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName(){
        return name;
    }

    public List<Ingredient> getIngredients(){
        return ingredients;
    }

}
