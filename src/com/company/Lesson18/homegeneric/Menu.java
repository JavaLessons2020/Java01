package com.company.Lesson18.homegeneric;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("С какими типами данных мы работем? 1 2 3 ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                ArrayEx<Integer> arrayEx = new ArrayEx<>();
                Integer[] scan = arrayEx.scan(scanner, Integer.class);
                System.out.println(Arrays.toString(scan));
                break;
            case 2:
                ArrayEx<Double> doubleEx = new ArrayEx<>();
                doubleEx.scan(scanner, Double.class);
                break;
            case 3:
                ArrayEx<String> strEx = new ArrayEx<>();
                strEx.scan(scanner, String.class);
                break;
        }

    }
}
