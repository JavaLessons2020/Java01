package com.Home.test5;

import java.util.ArrayList;

public class Team {
    private Developer developer;
    private ArrayList<Developer> developers;

    public Team() { developer = new Developer();
    }


    public void teamDeveloper() {
        developers = new ArrayList<>();
        developers.add(new Developer("Developer 1", developer.getSkills().get(0)));
        developers.add(new Developer("Developer 2", developer.getSkills().get(1)));
        developers.add(new Developer("Developer 3", developer.getSkills().get(2)));
        developers.add(new Developer("Developer 4", developer.getSkills().get(3)));
    }

    @Override
    public String toString() {
        return "Team{" +
                "developer=" + developer +
                ", developers=" + developers +
                '}';
    }
}
