package com.zajdsky.pokemonDatabase.Controllers;


import com.zajdsky.pokemonDatabase.Services.PokemonRepository;
import com.zajdsky.pokemonDatabase.Templates.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pokemons", pokemonRepository.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addPokemon(@RequestParam String name) {
        Pokemon pokemon = new Pokemon();
        pokemon.setName(name);
        pokemonRepository.save(pokemon);
        return "redirect:/";
    }
}
