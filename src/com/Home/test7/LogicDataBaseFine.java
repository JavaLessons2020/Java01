package com.Home.test7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LogicDataBaseFine {
    public void workDataBase() {

        Menu menu = new Menu();
        MethodDataBaseFine methodDataBaseFine = new MethodDataBaseFine();



        while (true) {
            menu.menu();
            Scanner scanner = new Scanner(System.in);
            switch (menu.getChoice()) {
                case 1:
                    methodDataBaseFine.printDataBase();
                    break;
                case 2:
                    System.out.println("Enter fine's code  person in format - 001");
                    //поиск человека по ИНН
                    try {
                        Integer codePerson = scanner.nextInt();
                        methodDataBaseFine.printCodePeopleFine(codePerson);
                    } catch (InputMismatchException e) {
                        System.out.println("You enter not integer number");
                    }
                    break;
                case 3:
                    try {
                        //Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter fine's code  1 - 8.");
                        //поиск штрафа
                        int searchFine = scanner.nextInt();
                        if (searchFine > 0 && searchFine < 9) {
                            String codeFine = "Fine " + searchFine;
                            System.out.println("Test code fine - " + codeFine);
                            methodDataBaseFine.printTypeFine(codeFine);
                        } else {
                            System.err.println("Fine's code mast be to 1 from 8!!!");
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("You enter not integer number!!!");
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("Enter name of city (default - Odessa, Lviv, Kiev )");
                    String nameCity = scanner.next();
                    methodDataBaseFine.printCityFine(nameCity);
                case 5:
                    Integer inn = 0;
                    String city = null;
                    Fine fine = new Fine();

                    String codeFine = null;
                    Integer sum = null;


                    //ввод ИНН
                    try {
                        while (true) {
                            System.out.println("Enter person'INN in format - 001");
                            Integer cashInn = scanner.nextInt();
                            if (cashInn <= 0) {
                                System.err.println("INN be can not negative!!!");
                                //проверка на наличее в базе этого ИНН
                            } else if (!methodDataBaseFine.checkAvailableCodePerson(inn)) {
                                System.out.println("This INN be in the Data Base Fine!!!");
                            } else {
                                inn = cashInn;
                                break;
                            }
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("You enter not integer number!!!");
                        e.printStackTrace();
                    }

                    //ввод названия города
                    while (true) {
                        System.out.println("Enter city of name.");
                        String cashCity = scanner.next();
                        if (city.isEmpty()) {
                            System.err.println("You enter empty line!!!");
                        } else {
                            city = cashCity;
                            break;
                        }
                    }

                    //ввад списка штрафов человека
                    while (true) {
                        try {
                            System.out.println("Enter code fine in format  integer number.");
                            int cashCode = scanner.nextInt();
                            codeFine = "Fine " + Math.abs(cashCode);
                            System.out.println("Enter sum fine in format integer number.");
                            Integer cashSum = scanner.nextInt();
                            if (cashSum <= 0) {
                                System.err.println("Sum fine can not be <= 0!!!");
                            } else {
                                sum = cashSum;
                            }
                        } catch (InputMismatchException e) {
                            System.err.println("You enter not integer number!!!");
                            e.printStackTrace();
                        }
                        try {
                             //fine.getFines().put(codeFine,sum);
                            fine.creatureElementMapFines(codeFine, sum);
                        } catch (NullPointerException e) {
                            System.err.println("Enter full data!!!");
                            e.printStackTrace();
                        }
                    }
                   // methodDataBaseFine.addNewPerson(inn,city,fine);

            }
        }
    }
}
