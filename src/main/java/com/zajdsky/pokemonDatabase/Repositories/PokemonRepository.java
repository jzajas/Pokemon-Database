package com.zajdsky.pokemonDatabase.Repositories;

import com.zajdsky.pokemonDatabase.Templates.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

    // Custom query using JPQL
    @Query("SELECT e FROM Pokemon e WHERE e.name = :name")
    List<Pokemon> findByName(@Param("name") String name);
}
