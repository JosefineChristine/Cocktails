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
        Ingredient ice = new Ingredient("ice", false);
        Ingredient milk = new Ingredient("mælk", true);
        Ingredient kaffelikør = new Ingredient("kaffelikør", true);

        cocktails.add(new Cocktail("Rom og cola", Arrays.asList(darkrum, cola, ice)));
        cocktails.add(new Cocktail("Vodka juice", Arrays.asList(vodka, juice, ice)));
        cocktails.add(new Cocktail("Dark and stormy", Arrays.asList(darkrum, gingerbeer, lemon, ice)));
        cocktails.add(new Cocktail("White Russian", Arrays.asList(milk, kaffelikør, ice)));
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


    public List<Cocktail> getCocktailsByIngredient(String searchWord) {
        ArrayList<Cocktail> cocktailsWithIngredient = new ArrayList<>();
        for (Cocktail cocktail : cocktails) {
            for (Ingredient ingredient : cocktail.getIngredients()){
                if (ingredient.getIngredientName().equalsIgnoreCase(searchWord)){
                    cocktailsWithIngredient.add(cocktail);
                }
            }
        }
        return cocktailsWithIngredient;
    }





}
