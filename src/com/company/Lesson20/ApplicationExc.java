package com.company.Lesson20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ApplicationExc {
    public static void main(String[] args)  {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                if (scanner.hasNextInt()) {
                    int i = scanner.nextInt();
                    System.out.println(i);
                    break;
                } else {
                    System.out.println("Вводите данные правильно");
                }
            } catch (InputMismatchException e) {
                System.out.println("Вводите данные корректно");
            } catch (IllegalStateException e) {
                System.out.println("scanner closed");
                break;
            }
        }

        File file = new File("C:\\Users\\ЛукашикЕвгенийАлекса\\Desktop\\JavaLessons2020\\index.html");
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
