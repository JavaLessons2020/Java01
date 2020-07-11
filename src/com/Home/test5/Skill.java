package com.Home.test5;

import java.util.ArrayList;

public class Skill {
    //Создание коллекции в которой будет храниться набор навыков для каждого разработчика
    ArrayList<String>skill = new ArrayList<>();

    //Два конструктора
    public Skill() {
    }

    public Skill(ArrayList<String> skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skill=" + skill +
                '}';
    }
}


