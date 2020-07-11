package com.company.Lesson7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class StringEx {
    public static void main(String[] args) {
        String str = "Hello Horld";
        String str1 = new String("Hello constr");
        char[] chars = {'q', 'w', 'e', 'r', 't'};

        String str2 = new String(chars, 1, 3);


        char c = str.charAt(1);
        System.out.println(c);//e

        String string = String.valueOf(str.charAt(0));
        System.out.println(string);//H


        int nums = 1234;
        String strNums = String.valueOf(nums);

        System.out.println("Номер в виде инта = " + nums
                + "  в виде строки = " + strNums);

        System.out.println("Номер в виде строки = ".concat(strNums));

//        int a [] = {};
//        int length = a.length;

        int length1 = str.length();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String line = scanner.nextLine();
//        System.out.println(line.isEmpty());


        System.out.printf("%d hello is = %s", 12, "hi\n");
        System.out.print(String.format("%d hello is = %s", 12, "hi"));

        System.out.println();

        String testString = "Котёнок";
        String testString1 = "\u041A\u043E\u0442\u0435\u043D\u043E\u043A";
        String testString2 = "К  ё";

        int myChar = testString2.codePointCount(0, 3);

        System.out.println(testString + "  " + testString1);
        System.out.println(myChar);

        int unit = testString.codePointAt(0);
        System.out.println(unit);


        boolean world = str.contains("World");

        System.out.println(str.startsWith("Hell"));
        System.out.println(str.endsWith(".png"));

        String string1 = "Toyota";
        String string2 = new String("toyota");

        System.out.println(string1.equalsIgnoreCase(string2));


        String strNew = "Hello World";

        int i = str.compareTo(strNew);
        System.out.println("Разница между строками = " + i);


        char[] buff = new char[str.length() + 6];
        str.getChars(0, str.length(), buff, 6);
        for (char c1 : buff) {
            System.out.print(c1 + " ");
        }
        System.out.println();


        System.out.println(str);


        String strIndex = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Ut enim ad minim veniam, quis quitrud exercitation ullamco laboris nisi" +
                " ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in" +
                " voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat" +
                " cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";

        int qui = strIndex.indexOf("qui");
        System.out.println(qui);
        int qui1 = strIndex.indexOf("qui", qui + 1);
        System.out.println(qui1);


        String hello = strIndex.substring(qui1, qui1 + 7);
        System.out.println(hello + " Hello");

        String cars = "Toyota Tesla Vas BMW ZAZ";

        //split
        String[] strings = cars.split(" ");
        for (String s : strings) {
            if (s.startsWith("T")) {
                System.out.println(s);
            }
        }


    }
}
