package com.Home.test8.game;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private int choice;

    public Menu(){ }

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

    public void menu(){
        System.out.println("Регистристрация нового игрока                    1");
        System.out.println("Увеличение или понижение рейтинга игрока         2");
        System.out.println("Список игр в которые играют все игроки           3");
        System.out.println("Рейтинг по нику игрока и игре                    4");
        System.out.println("Рейтинг 10 лучших игроков в определенной игре    5");
        System.out.println("Рейтинг 10 лучших игроков с учетом всех игр      6");
        System.out.println("toSring  all                                     7");
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextInt();
            setChoice(choice);
        } catch (InputMismatchException e) {
            System.err.println("You enter not integer number!!!");
            e.printStackTrace();
        }
    }
}
