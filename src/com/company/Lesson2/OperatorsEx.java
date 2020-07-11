package com.company.Lesson2;

public class OperatorsEx {

    public static void main(String[] args) {
//==============Math==============
        int first = 7;
        int second = 3;
        double res =  first % second;//7 - 6 = 1
        System.out.println("res = " + res);

         double pow = Math.pow(3, 2);
        int abs = Math.abs(-12); //  |12|
        double sqrt = Math.sqrt(9);

        System.out.println("sqrt = " + sqrt);
        System.out.println("abs = " + abs);
        System.out.println("pow = " + pow);
        //=================== Unar ================
        int a = -12;
        System.out.println(a++); //++
        System.out.println(a--); //--
        //================equal==================
        System.out.println(first == second);
        System.out.println(first != second);
        System.out.println(first <= second);
        System.out.println(first >= second);
        //===============Logic================
        System.out.println(first>second && second<first);
        System.out.println(first>second || second<first);

        //=============================
        first+=5; //first = first + 5;
        first*=5;//first = first * 5;

        //=================practic=============

        double x = 12;

        System.out.println(3*Math.sqrt(x));


       double a1 = 10;
        double b = 3;
        double c = 4;

        System.out.println( (-b + 1/a1) / 2/c );



    }
}

