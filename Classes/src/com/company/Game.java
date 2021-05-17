package com.company;

public class Game {
    private String type;
    private String name;
    private int numberOfPlayers;

    public Game(){
    }

    public Game(String type, String name){
        this.type = type;
        this.name = name;
    }

    public Game(String type, String name, int numberOfPlayers){
        this.type = type;
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }

    public boolean funToPlay(){
        return true;
    }

    public String whoCanPlay(){
        return "Adults and kids and Moms and Dads and neighbors and friends will all enjoy! Let's play!";
    }
}
