package org.example;

public class Main {

    public static void main(String[] args) throws Exception {
        String[] uriList = {"https://venson.net.br/resources/data/nomes.txt",
                "https://venson.net.br/resources/data/sobrenomes.txt",
                "https://venson.net.br/resources/data/posicoes.txt",
                "https://venson.net.br/resources/data/clubes.txt"};

        Player player = new Player(uriList);

        System.out.println(player.getDescription());
        System.out.println(player.getName());
        System.out.println(player.getSurname());
        System.out.println(player.getPosition());
        System.out.println(player.getTeam());
        System.out.println(player.getAge());
    }
}