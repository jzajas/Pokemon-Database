package com.zajdsky.pokemonDatabase.Repositories;

import com.zajdsky.pokemonDatabase.Templates.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
