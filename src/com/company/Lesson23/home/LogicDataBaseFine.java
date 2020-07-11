package com.company.Lesson23.home;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LogicDataBaseFine {
    public void workDataBase() {

        Menu menu = new Menu();
        MethodDataBaseFine methodDataBaseFine = new MethodDataBaseFine();


        while (true) {
            menu.menu();
            switch (menu.getChoice()) {
                case 1:
                    methodDataBaseFine.printDataBase();
                    break;
                case 2:
                    try {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter fine's code  1 - 8.");
                        //поиск штрафа
                        int searchFine = scanner.nextInt();
                        if (searchFine > 0 && searchFine < 9) {
                            String codeFine = "Fine " + searchFine;
                           // methodDataBaseFine.printTypeFine(codeFine);
                        } else {
                            System.err.println("Fine's code mast be to 1 from 8!!!");
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("You enter not integer number!!!");
                        e.printStackTrace();
                    }
                    break;
                case 3:

            }
        }
    }
}
