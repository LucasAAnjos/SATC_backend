package com.example.demo;

import org.springframework.stereotype.Service;
import org.example.Player;

@Service
public class PlayerService {
    private String[] uriList;
    public PlayerService() throws Exception {

        this.uriList = new String[]{"https://venson.net.br/resources/data/nomes.txt",
                "https://venson.net.br/resources/data/sobrenomes.txt",
                "https://venson.net.br/resources/data/posicoes.txt",
                "https://venson.net.br/resources/data/clubes.txt"};
    }

    public String getPlayer() throws Exception{
        Player player = new Player(uriList);
        return player.getDescription();
    }

}
