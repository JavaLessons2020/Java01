package com.company.Lesson20;

import java.util.Arrays;

public class ExceptionsEx {
    public static void main(String[] args)  {
        //String str = null;

        //System.out.println(str.isEmpty());

        String[] strings = {
                "new string 1",
                "new string 2",
                "new string 3",
        };

        String[] strings1 = Arrays.copyOf(strings, strings.length + 5);
        System.out.println(Arrays.toString(strings1));

        try {
            strings1[0].isEmpty();
            System.out.println("After try");

        } catch (NullPointerException e) {
            System.out.println("Null pointer!!!");
        }

        int first = 27;
        int second = 23;
        double third;
        int[] arr = {12, 45, 23};

        try {
            third = first / second;
            System.out.println("After try");
            System.out.println(third);
            arr[3] = (int) third;

        } catch (ArithmeticException e ) {
            System.out.println("деление на ноль");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                arr[3] = 23;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
