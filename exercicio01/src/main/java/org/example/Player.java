package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Player{

    private final String name;
    private final String surname;
    private final String position;
    private final String team;
    private final int age;


    public Player(String[] dataset) throws Exception {
        String nameList = requestList(dataset[0]);
        String surnameList = requestList(dataset[1]);
        String positionList = requestList(dataset[2]).replace("\"","").replace(",", "");
        String teamList = requestList(dataset[3]);

        this.name = randomIndex(nameList);
        this.surname = randomIndex(surnameList);
        this.position = randomIndex(positionList);
        this.team = randomIndex(teamList);
        this.age = getRandomNumber(16, 40);

    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private static String requestList(String uri) throws Exception{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private static String randomIndex(String list) {

        String[] array = list.split("\n");
        int index = (int) Math.floor(Math.random() * array.length);
        return array[index];
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getPosition(){
        return this.position;
    }

    public String getTeam(){
        return this.team;
    }

    public int getAge(){
        return this.age;
    }

    public String getDescription(){
        return String.format("%s %s é um futebolista  brasileiro de %d anos que atua como %s. Atualmente defende o %s.", name, surname, age, position, team);
    }
}
