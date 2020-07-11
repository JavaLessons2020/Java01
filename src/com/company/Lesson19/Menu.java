package com.company.Lesson19;

import java.sql.JDBCType;
import java.util.Arrays;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {

        Man man = new Man(true, Enum.BLUE, Month.MAY);
        Man man1 = new Man(false, Enum.BROWN, Month.JUNE);


        switch (man.eyeColor){
            case RED:
                System.out.println("red");
                break;
            case BLUE:
                System.out.println("blue");
        }


        Enum em = Enum.GREEN;
        Double integer = 10.2;



        System.out.println(em.name());//GREEN
        int ordinal = em.ordinal();//index
        System.out.println(ordinal);
        System.out.println(em.compareTo(Enum.RED));
        System.out.println(em);

    }
}
