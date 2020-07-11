package com.company.Lesson3;

public class Bits {
    public static void main(String[] args) {
    int a = 0b00101010;
    int b = 0B00001111;

        System.out.println(a);
        System.out.println(b);
    int c = 4;

    c = a>>2;

    System.out.println("c = " + Integer.toBinaryString(c)+ " decimal: " + c );
    //System.out.println("(a & b) = " + (true & true));//logic
    System.out.println("(a ^ b) = " + (a ^ b));//bit

    }
}
