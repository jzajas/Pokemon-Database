package com.zajdsky.pokemonDatabase.Controllers;

import com.zajdsky.pokemonDatabase.Services.PokemonService;
import com.zajdsky.pokemonDatabase.Templates.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class MainController {

    @Autowired
    private PokemonService pokemonService;


    @GetMapping("/pokemon")
    public String getAllPokemon(Model model) {
        Iterable<Pokemon> pokemonList = pokemonService.getAllPokemon();  // Call the instance method
        model.addAttribute("pokemonList", pokemonList);
        return "pokemon";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
