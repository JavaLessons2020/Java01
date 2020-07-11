package com.Home.test8.coffe;

import java.util.Scanner;

public class MachineMilkGroundCoffee extends Machine {

//      Задание 3
//        После модернизации, завод начал выпускать новые кофемашины, в которые можно загружать, кроме молотого кофе,
//        еще и немолотый кофе. Машина сама мелет кофе. Размер
//        бака для немолотого кофе зависит от модели. Зерновое кофе
//        после помолки попадает в бак для молотого кофе и уже оттуда идет в приготовление.
//        Чтобы удешевить машины, маркетинговый отдел придумал сократить функции этих кофемашин.
//        Данные кофемашины умеют готовить только:
//        * американо;
//        * лате.
//        Протестировать новую кофемашину.
//        Предыдушие тесты должны быть зелеными.
//        Добавились ошибки:
//        * Отсутвует зерновое кофе.

//    Задаем поле для кофе в зернах

    protected int maxCorn;
    protected int cornCoffee;
    protected int cornMilling;
    private int milkChoice;
    private int maxMilk;
    private int milk;

    // Задаем конструкторы

    MachineMilkGroundCoffee() {

    }

    MachineMilkGroundCoffee(String name, int maxCoffee, int maxWater, int maxContainer, int maxMilk, int maxCorn) {
        super(name, maxCoffee, maxWater, maxContainer);
        this.maxMilk = maxMilk;
        this.maxCorn = maxCorn;
    }

    // Геттеры и сеттеры

    public void setMaxCorn(int maxCorn) {
        this.maxCorn = maxCorn;
    }

    public void setCornCoffee(int cornCoffee) {
        this.cornCoffee = cornCoffee;
    }

    public void setMaxMilk(int maxMilk) {
        this.maxMilk = maxMilk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getMaxCorn() {
        return maxCorn;
    }

    public int getCornCoffee() {
        return cornCoffee;
    }

    public int getMaxMilk() {
        return maxMilk;
    }

    public int getMilk() {
        return milk;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("контейнер для зерна - " + getMaxCorn() + " г");
    }

    @Override
    public void describeCurrent() {
        super.describeCurrent();
        System.out.println("контейнер для зерна - " + getCornCoffee() + " г");
    }

    public boolean endCorn() {
        if (getCornCoffee() < 0) {
            System.out.println("Зерна нет. Пожалуйста добавьте зерно!");
            return true;
        } else {
            return false;
        }
    }

    public void overLoadCorn() {
        while (true) {
            if (endCorn()) {
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    cornCoffee += scanner.nextInt();
                    if (cornCoffee >= 0 && cornCoffee <= maxCorn) {
                        System.out.println("Зерно - " + getCornCoffee());
                        break;
                    } else {
                        if (cornCoffee > maxCorn) {
                            System.out.println("Перебор! Уберите лишнее зерно!");
                            cornCoffee += scanner.nextInt();
                        } else {
                            System.out.println("Недостаточно! Добавьте зерно!");
                            cornCoffee += scanner.nextInt();
                        }
                    }
                } else {
                    System.out.println("Вы ввели не корректное значение зерна!! Попробуйте снова.");
                }
                scanner.close();
            } else {
                System.out.println("Зерно - " + getCornCoffee());
                break;
            }
        }
    }

    public int choiceCorn() {

        System.out.println("Зерно или Молотый - <1> ЗЕРНО / <2> МОЛОТЫЙ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            cornMilling = Integer.parseInt(scanner.next());
        } else {
            choiceCorn();
        }
        if (cornMilling != 1 && cornMilling != 2) {
            System.out.println("Сделайте выбор - <1> ЗЕРНО / <2> МОЛОТЫЙ");
            choiceCorn();
        }
        scanner.close();
        return cornMilling;
    }

    public int run() {
        overLoadCorn();
        return super.run();
    }

    public void menu() {
        if (run() == 1) {
            //while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ваш выбор : 1 - американо ; 2 - лате ; 3 - выключить");
            while (sc.hasNextLine()) {
                //if (sc.hasNextInt()) {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= 3) {
                    switch (choice) {
                        case 1:
                            americano();
                            break;
                        case 2:
                            latte();
                            break;
                        case 3:
                            stop();
                            break;
                    }
                    //break;
                } else {
                    System.out.println("Не корректно введено значение");
                }
                break;
            }
        } else {
            System.out.println("Не корректно введено значение");
        }

    }
    // }

//}

    public boolean endMilk() {
        if (getMilk() <= 0) {
            System.out.println("Молока нет. Пожалуйста долейте молоко!");
            return true;
        } else {
            return false;
        }
    }

    public void notEnoughMilk() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (!endMilk()) {
                System.out.println("Введите колличество молока в кофе!");
                if (scanner.hasNextInt()) {
                    milkChoice = scanner.nextInt();
                    if (milkChoice <= milk && milkChoice >= 0) {
                        milk = milk - milkChoice;
                        break;
                    } else {
                        if (milkChoice >= milk && milkChoice <= maxMilk) {
                            System.out.println("Молока недостаточно. Пожалуйста долейте молоко!");
                            milk += scanner.nextInt();
                        }
                    }
                }
            } else {
                System.out.println("Молока нет. Пожалуйста долейте молоко!");
                milk += scanner.nextInt();
            }
        }
    }

    public void latte() {
        notEnoughMilk();
        int a = choiceCorn();
        while (true) {
            switch (a) {
                case 1:
                    if (choice == 2) {
                        if (cornCoffee >= 22 && water >= 30) {
                            cornCoffee = cornCoffee - 22;
                            super.water = super.water - 30;
                            container = container + 22;
                            System.out.println("Пожалуйста, Ваш латте!");
                            break;
                        } else {
                            if (cornCoffee < 22) {
                                System.out.println("Недостаточно зерна для приготовления латте !");
                                menu();
                            } else {
                                System.out.println("Недостаточно воды для приготовления латте !");
                                menu();
                            }
                        }
                    }
                    break;
                case 2:
                    if (choice == 2) {
                        if (coffee >= 22 && water >= 30) {
                            coffee = coffee - 22;
                            water = water - 30;
                            container = container + 22;
                            System.out.println("Пожалуйста, Ваш латте!");
                            break;
                        } else {
                            if (coffee < 22) {
                                System.out.println("Недостаточно кофе для приготовления латте !");
                                menu();
                            } else {
                                System.out.println("Недостаточно воды для приготовления латте !");
                                menu();
                            }
                        }
                    }
                    break;
            }
            break;
        }
        menu();
    }

    public void americano() {
        notEnoughMilk();
        int a = choiceCorn();
        while (true) {
            switch (a) {
                case 1:
                    if (choice == 1) {
                        if (cornCoffee >= 22 && water >= 30) {
                            cornCoffee = cornCoffee - 22;
                            water = water - 30;
                            container = container + 22;
                            System.out.println("Пожалуйста, Ваш американо!");
                            break;
                        } else {
                            if (cornCoffee < 22) {
                                System.out.println("Недостаточно зерна для приготовления американо !");
                                menu();
                            } else {
                                System.out.println("Недостаточно воды для приготовления американо !");
                                menu();
                            }
                        }
                    }
                    break;
                case 2:
                    if (choice == 1) {
                        if (coffee >= 22 && water >= 30) {
                            coffee = coffee - 22;
                            water = water - 30;
                            container = container + 22;
                            System.out.println("Пожалуйста, Ваш американо!");
                            break;
                        } else {
                            if (coffee < 22) {
                                System.out.println("Недостаточно кофе для приготовления американо !");
                                menu();
                            } else {
                                System.out.println("Недостаточно воды для приготовления американо !");
                                menu();
                            }
                        }
                    }
                    break;
            }
            break;
        }
        menu();
    }
}