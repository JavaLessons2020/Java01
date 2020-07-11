package com.company.Lesson15;

public  interface Car {
    String COLOR = "red";
    int SITS = 5;

    default void printInt(){
        System.out.println(COLOR+" "+ SITS);
    }

    static void hello(){
        System.out.println("Hello");
    }

    void print();
}
