package com.zajdsky.pokemonDatabase.Templates;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity @Table(name="pokemon", schema="public")
@NoArgsConstructor @Data
public class Pokemon {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private Types type1;
    private Types type2;
    private String name;


    public Pokemon(Types type1, Types type2, String name) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", type1=" + type1 +
                ", type2=" + type2 +
                ", name='" + name + '\'' +
                '}';
    }
}
