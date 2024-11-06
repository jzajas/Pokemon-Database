package com.zajdsky.pokemonDatabase.Services;

import com.zajdsky.pokemonDatabase.Repositories.PokemonRepository;
import com.zajdsky.pokemonDatabase.Templates.Pokemon;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
@RequiredArgsConstructor
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;


    public Iterable<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }

    public Pokemon getPokemonById(Long id) {
        Optional<Pokemon> optionalPokemon = pokemonRepository.findById(id);
        return optionalPokemon.orElse(null);
    }

    public List<Pokemon> findPokemonByName(String name){
        return pokemonRepository.findByName(name);
    }




//    TODO saving updating and deleting logic

    public Pokemon savePokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

}
