package com.company;

//Minseo Park
//minseo.park@stonybrook.edu

public class Team{
    private Player[] players;
    private String teamname;
    public Team(String teamname1){
        teamname = teamname1;
        players = new Player[]{};
    }

    public void addPlayer(int jerseyNo1, String position1, String name1, String height1, int weight1, String hand1, double battingAverage1){
        Player p1 = new Player(jerseyNo1, position1, name1, height1, weight1, hand1, battingAverage1);
        Player[] temp = new Player[players.length + 1];
        for(int i = 0; i < players.length; i++) {
            temp[i] = players[i];
        }
        temp[players.length] = p1;
        players = temp;
    }
    public Player searchPlayer(String name){
        for(Player p : players) {
            if(p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }
    public double battingAverage(){
        int playerCount = 0;
        double temp = 0;
        for(Player player : players) {
            playerCount++;
            temp += player.getBettingAverage();
        }
        return temp / playerCount;
    }
    public String heightAverage(){
        int playerCount = 0;
        int temp = 0;
        //1 feet = 12 inch
        for(Player player : players) {
            playerCount++;
            temp += Integer.parseInt(player.getHeight().substring(2, 3));
            temp += (Integer.parseInt(player.getHeight().substring(0, 1))) * 12;
        }
        int resultInInches = temp / playerCount;
        return String.valueOf(resultInInches / 12) + "-" + String.valueOf(resultInInches % 12);
    }
    public int numberOfPlayersBatting(String hand){
        int playerCount = 0;
        for(Player player : players) {
            if(!(player.getHand().equals(hand))) {
                playerCount++;
            }
        }
        return playerCount;
    }
    public int numberOfPlayersInPosition(String position){
        int playerCount = 0;
        for(Player player : players) {
            if(!(player.getPosition().equals(position))) {
                playerCount++;
            }
        }
        return playerCount;
    }

    public double battingAverageMinusPitchers() {
        int playerCount = 0;
        double temp = 0;
        for(Player player : players) {
            if(!(player.getPosition().equals("P"))) {
                playerCount++;
                temp += player.getBettingAverage();
            }
        }
        return temp / playerCount;
    }
}

