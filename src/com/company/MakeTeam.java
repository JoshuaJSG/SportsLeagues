package com.company;

public class MakeTeam {

    public void runTeams(){
        League<FootballTeam> premierLeague = new League<>("Premier League");
        FootballTeam arsenal = new FootballTeam("Arsenal");
        premierLeague.addTeam(arsenal);

        FootballTeam manCity = new FootballTeam("Man City");
        premierLeague.addTeam(manCity);

        FootballTeam leicester = new FootballTeam("Leicester");
        premierLeague.addTeam(leicester);

        FootballTeam wolves = new FootballTeam("Wolves");
        premierLeague.addTeam(wolves);

        FootballTeam tottenham = new FootballTeam("Tottenham Hotspur");
        premierLeague.addTeam(tottenham);

        FootballTeam liverpool = new FootballTeam("Liverpool");
        premierLeague.addTeam(liverpool);

        FootballTeam watford = new FootballTeam("Watford");
        premierLeague.addTeam(watford);

        arsenal.plays(manCity, 2, 1);
        manCity.plays(wolves, 3,2);
        manCity.plays(wolves, 3,2);
        manCity.plays(wolves, 3,2);
        leicester.plays(liverpool, 2, 3);
        tottenham.plays(manCity, 5,0);
        wolves.plays(arsenal, 2,2);
        wolves.plays(watford, 4,2);

        System.out.println();

        premierLeague.showTeams();

    }
}
