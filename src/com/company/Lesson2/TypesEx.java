package com.company.Lesson2;

public class TypesEx {
    public static void main(String[] args) {
        int a = 12;
        int b = 21;
        double c = (double) a / b;

        byte by = 127;
        double d = by;
        System.out.println(d);

        int ch = 97;
        System.out.println((char)ch);

        int b2 = 129;
        byte b3 = (byte) b2; //200 - 127 = -128 + 73 = -56
        System.out.println(b3);
        // 34 = 3+4 = 7


        //double d1 = Double.MAX_VALUE;
        double d1 = 1.456568789965;
        System.out.println(d1);
        float f = (float) d1;
        System.out.println(f);



    }
}
