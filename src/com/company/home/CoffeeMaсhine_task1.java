package com.company.home;

import java.util.Scanner;

public class CoffeeMaсhine_task1 extends CoffeeMaсhine implements CoffeeMaсhine1 {


    public CoffeeMaсhine_task1(int coffee, int maxCoffee, int water, int maxWater, int wasteCoffee, int maxWasteCoffee) {
        super(coffee, maxCoffee, water, maxWater, wasteCoffee, maxWasteCoffee);
    }

    //проверка
    //проверка - Отсутствует молотое кофе/только вывод сообщения в консоль.
    @Override
    public boolean catheWatchCoffee() {
        return super.catheWatchCoffee();
    }

    //проверка - Отсутствует вода/только вывод сообщения в консоль.
    @Override
    public boolean catheWatchWater() {
        return super.catheWatchWater();
    }

    //проверка - переполнен бак отработонного кофе/только вывод сообщения в консоль.
    @Override
    public boolean catheWatchWasteCoffee() {
        return super.catheWatchWasteCoffee();
    }


    public CoffeeMaсhine_task1() {
        super();
    }
//
//    @Override
//    public boolean catheWatchCoffee() {
//        return super.catheWatchCoffee();
//    }
//
//    @Override
//    public boolean catheWatchWater() {
//        return super.catheWatchWater();
//    }
//
//    @Override
//    public boolean catheWatchWasteCoffee() {
//        return super.catheWatchWasteCoffee();
//    }

    //кнопки
    //включение
    @Override
    public void on() {
        super.on();
    }

    //выключение
    @Override
    public void off() {
         super.off();
    }

    //выбор приготовляемого кофе
    @Override
    public void choiceCookingCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want Espresso(1) or Americano(2)? Enter 1/2!");
        if (scanner.hasNextInt()) {
            setTypeCoffee(scanner.nextInt());
            if (getTypeCoffee() == 1) {
                cookingEspresso();
            } else if (getTypeCoffee() == 2) {
                cookingAmericano();
            }else if (getTypeCoffee() < 1 || getTypeCoffee()>2) {
                System.out.println("You enter incorrect data");
                choiceCookingCoffee();
            }
        } else {
            //введенные значения != 1 или 2
            System.out.println("You enter not integer number!!!   ///choiceCookingCoffee()");
            choiceCookingCoffee();

        }
    }

    //приготовление экспрессо
    @Override
    public void cookingEspresso() {
        super.cookingEspresso();
    }

    //приготовление американо
    @Override
    public void cookingAmericano() {
        super.cookingAmericano();
    }

    //очистка бака отработанного кофе
    @Override
    public void tankCleaning() {
        super.tankCleaning();
    }

    //добавление воды
    @Override
    public void mySetWater() {
        super.mySetWater();
    }

    //добавление молотого кофе
    @Override
    public void mySetCoffee() {
        super.mySetCoffee();
    }
}


