package com.company.Lesson1;

public class Variable {

    public static void main(String[] args){
        int a = 112;
        a = 55;
        int b = 20;
        int c = b - a;
        System.out.println(a);

        final double PI = 3.14;
        System.out.println(PI);
        {
            int inner = 99;
            System.out.println(PI + inner);
        }
        //System.out.println(inner);

    }
}
