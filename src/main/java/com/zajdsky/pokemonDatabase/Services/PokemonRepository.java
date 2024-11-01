package com.zajdsky.pokemonDatabase.Services;

import com.zajdsky.pokemonDatabase.Templates.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

}
