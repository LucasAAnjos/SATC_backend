package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class PokemonService {
    ArrayList<Pokemon> party = new ArrayList<>();
    @Autowired
    StorageRepository storageRepository;
    public void capture(Pokemon pokemon){
        if (party.size() >= 6){
            System.out.println("Party is full! " + pokemon.getName() + " was sent to your PC. Check your pc.txt");
            storageRepository.storage(pokemon.getName());
        } else {
            System.out.println("You captured a wild " + pokemon.getName() + "! Pokemon level: " + pokemon.getLevel());
            party.add(pokemon);
        }
    }
}
