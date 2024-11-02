package com.zajdsky.pokemonDatabase.Services;

import com.zajdsky.pokemonDatabase.Repositories.PokemonRepository;
import com.zajdsky.pokemonDatabase.Templates.Pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;


    public List<Pokemon> getAllPokemon() {  // This is an instance method, not static
        return pokemonRepository.findAll();
    }

    public Pokemon savePokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }
}
