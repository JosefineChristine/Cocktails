package com.example.cocktails.controller;

import com.example.cocktails.model.Cocktail;
import com.example.cocktails.service.CocktailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("cocktails")
public class CocktailController {

    private final CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService){
        this.cocktailService = cocktailService;
    }

    @GetMapping("")
    public String listOfCocktails(Model model) {
        List<Cocktail> cocktails = cocktailService.getAllCocktails();
        model.addAttribute("cocktails", cocktails);
        return "cocktail-list";
    }

    @GetMapping("/cocktailrecipe")
    public String viewCocktailRecipe(@RequestParam("name") String name, Model model){
        Cocktail cocktail = cocktailService.viewCocktailRecipe(name);
        model.addAttribute("cocktail", cocktail);
        return "cocktail-detail";
    }



}
