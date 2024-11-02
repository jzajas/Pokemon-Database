package com.zajdsky.pokemonDatabase.Controllers;

import com.zajdsky.pokemonDatabase.Services.PokemonService;
import com.zajdsky.pokemonDatabase.Templates.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MainController {

    @Autowired
    private PokemonService pokemonService;


    @GetMapping("/pokemon")
    public String getAllPokemon(Model model) {
        List<Pokemon> pokemonList = pokemonService.getAllPokemon();  // Call the instance method
        model.addAttribute("pokemonList", pokemonList);
        return "pokemon";  // This refers to the Thymeleaf template called "pokemon.html"
    }

}
