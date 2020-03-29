package com.company;

public class FootballTeam extends Team implements Comparable<FootballTeam> {

    int won =0;
    int lost =0;
    int drew =0;

    public FootballTeam(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void plays(FootballTeam team, int myScore, int theirScore){
        if (myScore < theirScore){
            lost++;
        } else if (myScore > theirScore){
            won++;
        }
        else {
            drew++;
        }
        if (team !=null){
            team.plays(null, theirScore, myScore);
        }
    }

    public int ranking(){
        return (won * 2) + drew;
    }


    @Override
    public int compareTo(FootballTeam team) {
        if (this.ranking() > team.ranking()){
            return -1;
        } else if (this.ranking() < team.ranking()){
            return 1;
        } else {
            return 0;
        }
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getDrew() {
        return drew;
    }
}
