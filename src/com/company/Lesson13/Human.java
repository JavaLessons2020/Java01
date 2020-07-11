package com.company.Lesson13;

public class Human {
    int age;

    public Human() {
        this(18);
    }
    public Human(int age) {
        this.age = age;
        System.out.println(age);
    }
}

class RunHuman {

    public static void main(String[] args) {
        Human human = new Human(25);
    }
}