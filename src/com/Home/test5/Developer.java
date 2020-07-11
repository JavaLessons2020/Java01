package com.Home.test5;

import java.util.ArrayList;

public class Developer {
    //private Skill skill;
    private String developerName;//имя разработчика
    private Skill skill;
    private ArrayList<Skill>skills;



    public Developer(){ skill = new Skill();
    }

    public Developer(String developerName, Skill skill) {
        this.developerName = developerName;
        this.skill = skill;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public void developerSkills(){

        //Создание списка навыков каждого разработчика
        ArrayList<String>skills1 = new ArrayList<>();
        skills1.add("Skill1");
        skills1.add("Skill2");

        ArrayList<String>skills2 = new ArrayList<>();
        skills2.add("Skill1");
        skills2.add("Skill3");
        skills2.add("Skill4");

        ArrayList<String>skills3 = new ArrayList<>();
        skills3.add("Skill5");
        skills3.add("Skill6");
        skills3.add("Skill7");
        skills3.add("Skill8");

        ArrayList<String>skills4 = new ArrayList<>();
        skills4.add("Skill1");
        skills4.add("Skill4");
        skills4.add("Skill6");
        skills4.add("Skill7");
        skills4.add("Skill8");

        //Заполнение коллекции классов Skill
        skills = new ArrayList<>();
        skills.add(new Skill(skills1));
        skills.add(new Skill(skills2));
        skills.add(new Skill(skills3));
        skills.add(new Skill(skills4));
    }

    @Override
    public String toString() {
        return "Developer{" +
                "developer='" + developerName + '\'' +
                ", skill=" + skill +
                '}';
    }
}
