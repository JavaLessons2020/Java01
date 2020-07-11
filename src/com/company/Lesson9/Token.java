package com.company.Lesson9;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        String s = "Hello  _World javaScript? Java, JavaClass";
        StringTokenizer token = new StringTokenizer(s);

        while (token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
    }
}
