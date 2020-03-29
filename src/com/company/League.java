package com.company;

import com.company.FootballTeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

    private String name;



    List<FootballTeam> teamsInLeague = new ArrayList<>();
    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(FootballTeam team){
        if (teamsInLeague.contains(team)){
            return false;
        } else {
            teamsInLeague.add(team);
        }
        return true;
    }


    public void showTeams(){
        System.out.println("Premier League Table");
        int rank = 1;
        Collections.sort(teamsInLeague);
        for (FootballTeam team: teamsInLeague) {
            System.out.println(rank +": " + team.getName() + ":" + " Wins: " +team.getWon()
                    + ", Losses: " + team.getLost()
                    + ", Drew: " +team.getDrew());
            rank++;
        }
    }
}
