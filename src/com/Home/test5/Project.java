package com.Home.test5;

public class Project {
    //*Создать класс Team, который содержит коллекции экземпляров класс Developer.
    //* Класс Developer содержит коллекцию классов Skill
    //* Создать класс Project, который содержит экземпляр класса Team.
    //* Необходимо реализовать методы для вывода на экран всех разработчиков в команде и вывести
    //их навыки.
    public static void main(String[] args) {
        Skill skill = new Skill();
        Developer developer = new Developer();
        Team team = new Team();
        developer.developerSkills();
        team.teamDeveloper();
        System.out.println(team);
    }
}
