package com.example.cocktails.repository;

import com.example.cocktails.model.Cocktail;
import com.example.cocktails.model.Ingredient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CocktailRepository {
    List<Cocktail> cocktails = new ArrayList<>();

    public CocktailRepository(){
        populateCocktails();
    }

    public void populateCocktails(){
        Ingredient vodka = new Ingredient("vodka", false);
        Ingredient darkrum = new Ingredient("dark rum", false);
        Ingredient cola = new Ingredient("cola", false);
        Ingredient juice = new Ingredient("juice", true);
        Ingredient gingerbeer = new Ingredient("gingerbeer", false);
        Ingredient lemon = new Ingredient("lemon", false);

        cocktails.add(new Cocktail("rom-og-cola", Arrays.asList(darkrum, cola)));
        cocktails.add(new Cocktail("vodka-juice", Arrays.asList(vodka, juice)));
        cocktails.add(new Cocktail("dark-and-stormy", Arrays.asList(darkrum, gingerbeer, lemon)));
    }

    public List<Cocktail> getAllCocktails(){
        return cocktails;
    }

    public Cocktail getCocktailRecipe(String name){
        for (Cocktail cocktail : cocktails){
            if (cocktail.getName().equalsIgnoreCase(name)){
                return cocktail;
            }
        }
        return null;
    }





}
