package com.zajdsky.pokemonDatabase.Controllers;

import com.zajdsky.pokemonDatabase.Services.PokemonService;
import com.zajdsky.pokemonDatabase.Templates.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @PostMapping("/add")
    public Pokemon addPokemon(@RequestBody Pokemon pokemon) {
        return pokemonService.savePokemon(pokemon);  // Saves the Pokemon to the database
    }

    @GetMapping("/all")
    public List<Pokemon> getAllPokemon() {
        return pokemonService.getAllPokemon();
    }
}
