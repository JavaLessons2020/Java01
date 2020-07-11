package com.company.Lesson12;

import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {

        String password;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пароль вводиться латинскими символами.");
        System.out.println("Пароль должен содержать хотя бы одну заглавную букву");
        System.out.println("Пароль должен содержать хотя бы одну строчную букву");
        System.out.println("Пароль должен содержать 8 символов");
        System.out.println("Введите пароль: ");
        password = scanner.nextLine();

        if (password.isEmpty()) {
            System.out.println("Вы ввели пустую строку! Повторите ввод!");
            Scanner scanner1 = new Scanner(System.in);
            password = scanner1.nextLine();
            System.out.println("Вы ввели строку: " + password);

        } else {
            System.out.println("Вы ввели строку: " + password);
        }



        if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$")){
            System.out.println("Вы ввели валидный пароль");
        } else {
            System.out.println("Ваш пароль не валидный");
        }

    }
}
