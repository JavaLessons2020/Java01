package com.company.Lesson8;

import java.util.Random;

public class StringEx2 {
    public static void main(String[] args) {

        double random1 = 10 + Math.random()*20;

        Random random = new Random();
        int i = -20 + random.nextInt(40);
        System.out.println("random = " + i);


        String str = "Hello World";
        String str1 = new String("Hello World");
        String intern = str1.intern();

        System.out.println(str.equals(intern));

        //Java 11

        String none = "     ";
        System.out.println("Empty = " + none.isEmpty());
        System.out.println("Blank = " + none.isBlank());

        String trimEx = "    hello    ";
        System.out.println(trimEx.trim());
        System.out.println(trimEx.strip());
        System.out.println(trimEx.stripLeading());
        System.out.println(trimEx.stripTrailing());

        System.out.println(trimEx.repeat(5));


    }
}
