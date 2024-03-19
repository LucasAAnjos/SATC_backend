package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        Pokemon pokemon = context.getBean(Pokemon.class, "Charmander", 20);

        PokemonService pokemonService  = context.getBean(PokemonService.class);

        pokemonService.capture(pokemon);
        pokemonService.capture(pokemon);
        pokemonService.capture(pokemon);
        pokemonService.capture(pokemon);
        pokemonService.capture(pokemon);
        pokemonService.capture(pokemon);
        pokemonService.capture(pokemon);

    }
}
