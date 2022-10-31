package com.company;

//Minseo Park
//minseo.park@stonybrook.edu

public class Player{
    private int jerseyNo;
    private String position;
    private String name;
    private String height;
    private int weight;
    private String hand;
    private double battingAverage;

    public Player(int jerseyNo1, String position1, String name1, String height1, int weight1, String hand1, double battingAverage1){
        jerseyNo = jerseyNo1;
        position = position1;
        name = name1;
        height = height1;
        weight = weight1;
        hand = hand1;
        battingAverage = battingAverage1;
    }
    public int getJerseyNo(){
        return jerseyNo;
    }
    public String getPosition(){
        return position;
    }
    public String getName(){
        return name;
    }
    public String getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
    public String getHand(){
        return hand;
    }
    public double getBettingAverage(){
        return battingAverage;
    }
    public String toString(){
        return "(" + jerseyNo + ", " + position + ", " + name + ", " + height + ", " + weight + ", " + hand + ", " + battingAverage + ")";
    }
}

