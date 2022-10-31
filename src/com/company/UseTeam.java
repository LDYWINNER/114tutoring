package com.company;

public class UseTeam {

    // A method that builds a team given a team name
    private static Team buildTeam (String teamName) {

        Team tm = new Team(teamName);

        if (teamName.equals("Giants")) {
            // I only added the players on the active list (this list is a few
            // years old).
            // Arguments to addPlayer method mean:
            //    jersey no,
            //    position (Pitcher, Catcher, Infielder, Outfielder),
            //    name,
            //    height,
            //    weight,
            //    hand (Right, Left, Switch), and
            //    batting average (I made up the numbers myself)
            // in the given order.
            tm.addPlayer(41, "P", "Jeremy Affeldt", "6-5", 226, "L", .231);
            tm.addPlayer(40, "P", "Madison Bumgarner", "6-4", 215, "R", .171);
            tm.addPlayer(18, "P", "Matt Cain", "6-3", 230, "R", .114);
            tm.addPlayer(46, "P", "Santiago Casilla", "6-0", 201, "R", .153);
            tm.addPlayer(17, "P", "Tim Hudson", "6-1", 175, "R", .145);
            tm.addPlayer(78, "P", "David Huff", "6-2", 215, "S", .175);
            tm.addPlayer(55, "P", "Tim Lincecum", "5-11", 170, "L", .13);
            tm.addPlayer(49, "P", "Javier Lopez", "6-4", 230, "L", .111);
            tm.addPlayer(63, "P", "Jean Machi", "6-0", 255, "R", .129);
            tm.addPlayer(52, "P", "Yusmeiro Petit", "6-1", 250, "R", .211);
            tm.addPlayer(54, "P", "Sergio Romo", "5-11", 191, "R", .123);
            tm.addPlayer(32, "P", "Ryan Vogelsong", "6-4", 215, "R", .159);
            tm.addPlayer(28, "C", "Buster Posey", "6-1", 205, "R", .298);
            tm.addPlayer(29, "C", "Hector Sanchez", "6-0", 235, "S", .234);
            tm.addPlayer(53, "I", "Ehire Adrianza", "6-1", 170, "S", .298);
            tm.addPlayer(13, "I", "Joaquin Arias", "6-1", 165, "R", .234);
            tm.addPlayer(9,  "I", "Brandon Belt", "6-1", 220, "L", .254);
            tm.addPlayer(35, "I", "Brandon Crawford", "6-2", 215, "L", .253);
            tm.addPlayer(48, "I", "Pablo Sandoval", "5-11", 246, "S", .305);
            tm.addPlayer(19, "I", "Marco Scutaro", "5-10", 185, "R", .321);
            tm.addPlayer(7,  "O", "Gregor Blanco", "5-11", 175, "L", .295);
            tm.addPlayer(38, "O", "Michael Morse", "6-5", 245, "R", .312);
            tm.addPlayer(16, "O", "Angel Pagan", "6-2", 200, "S", .342);
            tm.addPlayer(8,  "O", "Hunter Pence", "6-4", 220, "R", .287);
            tm.addPlayer(2,  "O", "Juan Perez", "5-11", 185, "R", .284);
        }
        // I used Angels as the second team, but you are welcome to try any
        // other team, possibly a Korean team if you wish.  If you choose a
        // different team, make appropriate changes below with the new
        // team name.  For this team, you can use the current data this year.
        else if (teamName.equals("Angels")) {
            tm.addPlayer(55, "P", "Joe Blanton", "6-3", 215, "R", .123);
            tm.addPlayer(34, "P", "Janson Junk", "6-0", 177, "R", .235);
            tm.addPlayer(14, "P", "Aaron Loup", "5-11", 210, "L", .379);
            tm.addPlayer(31, "P", "Jaime Barria", "6-0", 210, "R", .238);
            tm.addPlayer(28, "P", "Elvis Peguero", "6-5", 208, "R", .312);
            tm.addPlayer(15, "P", "Andrew Wantz", "6-4", 235, "R", .237);
            tm.addPlayer(12, "P", "Ryan Tepera", "6-1", 195, "R", .324);
            tm.addPlayer(24, "P", "Jose Suarez", "5-10", 225, "L", .145);
            tm.addPlayer(18, "P", "Chase Silseth", "6-0", 217, "R", .246);
            tm.addPlayer(22, "P", "Rob Zastryzny", "6-3", 205, "S", .321);
            tm.addPlayer(25, "P", "Shohei Ohtani", "6-4", 210, "S", .421);
            tm.addPlayer(19, "P", "Brian Moran", "6-4", 225, "L", .298);
            tm.addPlayer(8, "C", "Austin Romine", "6-1", 216, "R", .224);
            tm.addPlayer(39, "C", "Chad Wallach", "6-3", 246, "R", .267);
            tm.addPlayer(42, "I", "Matt Duffy", "6-2", 190, "R", .329);
            tm.addPlayer(48, "I", "Mike Ford", "6-0", 225, "S", .198);
            tm.addPlayer(3, "I", "Phil Gosselin", "6-1", 188, "R", .167);
            tm.addPlayer(13, "I", "Luis Rengifo", "5-10", 195, "S", .229);
            tm.addPlayer(51, "I", "Tyler Wade", "6-1", 254, "S", .355);
            tm.addPlayer(53, "I", "Jonathan Villar", "6-1", 233, "S", .344);
            tm.addPlayer(33, "O", "Jo Adell", "6-3", 215, "R", .188);
            tm.addPlayer(16, "O", "Jose Rojas", "6-0", 200, "S", .211);
            tm.addPlayer(7, "O", "Dillon Thomas", "6-1", 215, "L", .237);
            tm.addPlayer(47, "O", "Taylor Ward", "6-1", 200, "R", .333);
            tm.addPlayer(54, "O", "Aaron Whitefield", "6-4", 210, "R", .112);
            // Add the remaining players for Angels
            // If you want to make them up rather than using the real
            // data, that is acceptable.
        }
        else {
            System.out.println(teamName + " is not supported yet.");
            return null;
        }
        return tm;
    }

    public static void main (String[] args) {

        Team giants = buildTeam("Giants");
        Team angels = buildTeam("Angels");

        Player p = giants.searchPlayer("Jeremy Affeldt");

        System.out.println("Info on Jeremy Affeldt is: " + p.toString());


        // battingAverage() returns the batting average of all the players
        // on the team.
        System.out.println("\nBatting average of Giants is: "
                + giants.battingAverage());

        /****************************************************************
         * Suggestion - do incremental development.  Comment out the rest
         * of this file and make the code above this line work.  After and
         * only after you COMPLETED that much start uncommenting one line
         * at a time making it work until you are done with the rest of it.
         ******************************************************************/

        // battingAverageMinusPitchers() returns the batting average of all
        // the players on the team not including pitchers.
        System.out.println("Batting average of Giants not including pitchers is: "
                + giants.battingAverageMinusPitchers());


        // heightAverage() returns the average height of all the players
        // on the team in number of feet and inches, e.g., "6-3" if it is
        // 6 feet 3 inches.
        // Hints: To get this part done in the Team class, you will want
        //   to create a function that converts "6-3" to 75 inches and
        //   another function that converts 75 inches into "6-3".
        //   These two functions can be added to Team as static methods
        //   and use them, much like we added printArray as a static method
        //   to ArrayTools.
        //   Or, if you want to create a separate class, say Tools, much
        //   like we crated ArrayTools for array related tools, and include
        //   these functions in Tools and use them that way.  Your choice!
        System.out.println("\nAverage height of Giants players is: "
                + giants.heightAverage());

        // A batter may be right-handed ("R"), left-handed ("L"), or
        // switching between left and right ("S").
        System.out.println("\nNumber of switch hitters on the Giants team is: "
                + giants.numberOfPlayersBatting("S"));
        System.out.println("Number of right handed hitters on the Giants team is: "
                + giants.numberOfPlayersBatting("R"));
        System.out.println("Number of left handed hitters on the Giants team is: "
                + giants.numberOfPlayersBatting("L"));


        System.out.println("\nNumber of pitchers on the Giants team is: "
                + giants.numberOfPlayersInPosition("P"));
        System.out.println("Number of catchers on the Giants team is: "
                + giants.numberOfPlayersInPosition("C"));
        System.out.println("Number of infielders on the Giants team is: "
                + giants.numberOfPlayersInPosition("I"));

        // Note that I have used giants so far with the methods in
        // Team.  Sorry I picked Giants if Giants is not one of
        // your favorite teams.

        // You are asked to repeat what I have done so far except
        // using Angels instead, yes of course you will have to change
        // a few things to do so along the way, e.g., use an Angels
        // player name rather than Giants player name.  This much is
        // required.  Actually, if you want to use your own favorite
        // team instead of Angels, feel free to do so.

        // Add a few more interesting methods to Team if you wish and
        // call them with either giants or angels or both.  This last
        // part is not required.

        // Or, even add more teams if you like.
    }

}

