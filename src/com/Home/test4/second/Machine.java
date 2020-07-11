package com.Home.test4.second;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

// Задание 1
//Завод выпускает разные модели кофемашин, с различными характеристиками.
//Кофемашина загружается молотым кофе и водой. Максимальные значения загрузки зависят от модели.
//На приготовление одной чашки тратится:
//* эспрессо – 22 г молотого кофе и 30 мл;
//* американо – 22 г молотого кофе и 100 мл воды.
//Отработанное кофе сбрасывается в специальный бак, емкость бака зависит от модели.
//Кофемашина может выдавать различные ошибки при работе.
//* Отсутствует вода.
//* Отсутствует молотое кофе.
//* Переполнен бак с отработанным кофе.
//Кофемашина имеет кнопки:
//* включения;
//* выключения;
//* Приготовить эспрессо;
//* Приготовить американо;
//* Очистка бака отработанного кофе.

// Создаем класс на основе интерфеса

public class Machine implements CoffeeMachine {

    // Поля класса

    private String name;
    protected int maxCoffee;
    protected int maxWater;
    protected int coffee;
    protected int water;
    protected int container;
    protected int choice;

    // Конструктор по умолчанию

    Machine() {

    }

    // Конструктор с параметрами

    Machine(String name, int maxCoffee, int maxWater, int maxContainer) {
        this.name = name;
        this.maxCoffee = maxCoffee;
        this.maxWater = maxWater;
        maxContainer = maxCoffee;
    }

    // Геттеры и сеттеры параметров

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxCoffee(int maxCoffee) {
        this.maxCoffee = maxCoffee;
    }

    public void setMaxWater(int maxWater) {
        this.maxWater = maxWater;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setContainer(int container) {
        this.container = container;
    }

    public String getName() {
        return name;
    }

    public int getMaxCoffee() {
        return maxCoffee;
    }

    public int getMaxWater() {
        return maxWater;
    }

    public int getContainer() {
        return container;
    }

    public int getCoffee() {
        return coffee;
    }

    public int getWater() {
        return water;
    }

    // Перегруженый метод по приготовлению эспрессо

    @Override
    public void espresso() {
        while (true) {
            if (choice == 1) {
                if (coffee >= 22 && water >= 30) {
                    coffee = coffee - 22;
                    water = water - 30;
                    container = container + 22;
                    System.out.println("Пожалуйста, Ваш эспрессо!");
                    break;
                } else {
                    if (coffee < 22) {
                        System.out.println("Недостаточно кофе для приготовления эспрессо !");
                        menu();
                    } else {
                        if (water < 30) {
                            System.out.println("Недостаточно воды для приготовления эспрессо !");
                            menu();
                        }
                    }
                }
            }
        }
        menu();
    }

    // перегруженый метод по приготовлению американо

    @Override
    public void americano() {
        while (true) {
            if (choice == 2) {
                if (coffee >= 22 && water >= 100) {
                    coffee = coffee - 22;
                    water = water - 100;
                    container = container + 22;
                    System.out.println("Пожалуйста, Ваш американо!");
                    break;
                } else {
                    if (coffee < 22) {
                        System.out.println("Недостаточно кофе для приготовления эспрессо !");
                        menu();
                    } else {
                        if (water < 100) {
                            System.out.println("Недостаточно воды для приготовления эспрессо !");
                            menu();
                        }
                    }
                }
            }
        }
        menu();
    }

    // перегруженый метод по проверке загрузки контейнера с зерном

    @Override
    public boolean endCoffee() {
        if (getCoffee() <= COFFEE) {
            System.out.println("Кофе нет. Пожалуйста засыпте кофе!");
            return true;
        } else {
            return false;
        }
    }

    // перегруженый метод по проверке загрузки контейнера с водой

    @Override
    public boolean endWater() {
        if (getWater() < WATER) {
            System.out.println("Воды нет. Пожалуйста залейте воду!");
            return true;
        } else {
            return false;
        }
    }

    // перегруженный метод по проверке контейнера с отходами от помола зерна.
    // Контейнер под помол зерна равен по объему контейнеру для зерна

    @Override
    public boolean overContainer() {
        if (container >= maxCoffee) {
            return true;
        } else {
            return false;
        }
    }

    // перегруженый метод по очистке контейнера от отходов от помола кофейного зерна

    @Override
    public void cleanContainer() {
        container = CONTAINER;
        System.out.println("Контейнер пустой!");
    }

    // перегруженый метод по выводу характеристик аппарата

    @Override
    public void describe() {
        System.out.println("Кофемашина марки : " + getName());
        System.out.println("Характеристики : \nконтейнер для молотого кофе - " + getMaxCoffee() + " г\n"
                + "контейнер для воды - " + getMaxWater() + " мл\n"
                + "контейнер отходов - " + getMaxCoffee() + " г");
    }

    // метод вывода текущей ситуации по загрузке кофемашины зерном, водой,
    // отходами после помола

    public void describeCurrent() {
        System.out.println("Кофемашина марки : " + getName());
        System.out.println("Загружено : \nконтейнер для молотого кофе - " + getCoffee() + " г\n"
                + "контейнер для воды - " + getWater() + " мл\n"
                + "контейнер отходов - " + getContainer() + " г");
    }

    // перегруженый метод включения аппарата и проверка готовности машины к
    // выполнению задания

    public void overloadEnoughCoffee() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (endCoffee()) {
                coffee += scanner.nextInt();
                if (coffee <= maxCoffee && coffee >= 22) {
                    System.out.println("Помол кофе  - " + getCoffee());
                    break;
                } else {
                    if (coffee > maxCoffee) {
                        System.out.println("Перебор! Уберите кофе!");
                        coffee = scanner.nextInt();
                    } else {
                        if (coffee < 22) {
                            System.out.println("Недостаточно! Добавьте кофе!");
                            coffee += scanner.nextInt();
                        }
                    }
                }
            } else {
                System.out.println("Помол кофе - " + getCoffee());
                break;
            }
            scanner.close();
        }
    }

    public void overloadEnoughWater() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (endWater() && scanner.hasNextInt()) {
                water += scanner.nextInt();
                if (water <= maxWater && water >= 100) {
                    System.out.println("Вода - " + getWater());
                    break;
                } else {
                    if (water > maxWater) {
                        System.out.println("Перебор! Уберите воду!");
                        water -= scanner.nextInt();
                    } else {
                        if (water < 100) {
                            System.out.println("Недостаточно! Добавьте воду!");
                            water += scanner.nextInt();
                        }
                    }
                }
            } else {
                System.out.println("Вода - " + getWater());
                break;
            }
            scanner.close();
        }
    }

    public void turnOnTurnOff() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (overContainer() && scanner.hasNextInt()) {
                System.out.println("Контейнер полный. Пожалуйста нажмите <1>, чтобы ОЧИСТИТЬ КОНТЕЙНЕР!");
                if (scanner.nextInt() == 1) {
                    cleanContainer();
                } else {
                    run();
                }
                System.out.println("Кофемашина готова! Сделать кофе - нажмите <1>, Выключить - нажмите <2>");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        choice = 1;
                        break;
                    case 2:
                        choice = 2;
                        break;
                    default:
                        System.out.println("Попробуйте еще раз");
                        run();
                        break;
                }
                break;
            } else {
                System.out.println("Кофемашина готова! Сделать кофе - нажмите <1>, Выключить - нажмите <2>");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            choice = 1;
                            break;
                        case 2:
                            choice = 2;
                            break;
                        default:
                            System.out.println("Попробуйте еще раз");
                            run();
                            break;
                    }
                }
                break;
            }
        }
    }

    @Override
    public int run() {

        overloadEnoughCoffee();
        overloadEnoughWater();
        turnOnTurnOff();
        return choice;
    }

    // перегруженый метод выкл аппарата

    @Override
    public void stop() {
        System.out.println("Выключаюсь! До скорой встречи!");

    }

    @Override
    public void menu() {
        if (run() == 1) {
            System.out.println("Ваш выбор : 1 - эспрессо ; 2 - американо ; 3 - выключить");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    espresso();
                    break;
                case 2:
                    americano();
                    break;
                case 3:
                    stop();
                    break;
            }
            scanner.close();
        }
    }
}

