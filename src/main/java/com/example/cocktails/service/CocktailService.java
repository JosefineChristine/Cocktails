package com.example.cocktails.service;

import com.example.cocktails.model.Cocktail;
import com.example.cocktails.repository.CocktailRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CocktailService {

    private final CocktailRepository cocktailRepository;

    public CocktailService(CocktailRepository cocktailRepository){
        this.cocktailRepository = cocktailRepository;
    }

    public List<Cocktail> getAllCocktails(){
        return cocktailRepository.getAllCocktails();
    }

    public Cocktail getCocktailRecipe(String name) {
        return cocktailRepository.getCocktailRecipe(name);
    }


}
