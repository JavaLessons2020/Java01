package com.Home.test7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private int choice;

    public Menu() {
    }

    public Menu(int choice) {
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        if (choice > 0 && choice < 9) {
            this.choice = choice;
        } else {
            System.err.println("Number must be >0 and <9!!!");
        }
    }

    public void menu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Полная распечатка базы данных                           1");
        System.out.println("Распечатка данных по конкретному коду(человека)         2");
        System.out.println("Распечатка данных по конкретному типу штрафа            3");
        System.out.println("Распечатка данных по конкретному городу                 4");
        System.out.println("Добавление нового человека с информацией о нем          5");
        System.out.println("Добавление новых штрафов для уже существующей записи    6");
        System.out.println("Удаление штрафа                                         7");
        System.out.println("Замена информации о человеке и его штрафах              8");
        try {
            choice = scanner.nextInt();
            setChoice(choice);
        } catch (InputMismatchException e) {
            System.err.println("You enter not number!!!");
            e.printStackTrace();
        }
    }
}

