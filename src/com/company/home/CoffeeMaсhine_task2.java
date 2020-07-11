package com.company.home;

import java.util.Scanner;

public class CoffeeMaсhine_task2 extends CoffeeMaсhine implements CoffeeMaсhine2 {

    public CoffeeMaсhine_task2(int coffee, int maxCoffee, int water, int maxWater, int milk, int maxMilk, int wasteCoffee, int maxWasteCoffee) {
        super(coffee, maxCoffee, water, maxWater, milk, maxMilk, wasteCoffee, maxWasteCoffee);
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

    //проверка - Отсутствует молоко/только вывод сообщения в консоль.
    @Override
    public boolean catheWatchMilk() {
        return super.catheWatchMilk();
    }

    //проверка - переполнен бак отработонного кофе/только вывод сообщения в консоль.
    @Override
    public boolean catheWatchWasteCoffee() {
        return super.catheWatchWasteCoffee();
    }


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
        System.out.println("Do you want Espresso(1) or Americano(2) or Late(3) or Cappuccino(4)? Enter 1/2/3/4 !");
        if (scanner.hasNextInt()) {
            setTypeCoffee(scanner.nextInt());
            if (getTypeCoffee() == 1) {
                cookingEspresso();
            } else if (getTypeCoffee() == 2) {
                cookingAmericano();
            } else if (getTypeCoffee() == 3) {
                cookingLate();
            } else if (getTypeCoffee() == 4) {
                cookingCappuccino();
            }else if (getTypeCoffee() < 1 || getTypeCoffee()>4) {
                System.out.println("You enter incorrect data");
                choiceCookingCoffee();
            }
            } else {
                //введенные значения != 1/2/3/4
                System.out.println("You enter not integer number!!!   ///choiceCookingCoffee()");
                choiceCookingCoffee();
            }
        }


    //григотовление экспрессо
    @Override
    public void cookingEspresso() {
        super.cookingEspresso();
    }

    //приготовление американо
    @Override
    public void cookingAmericano() {
        super.cookingAmericano();
    }

    //Приготовить лате (2 части молока)
    @Override
    public void cookingLate() {
        super.cookingLate();
    }

    //Приготовить капучино (1 части молока)
    @Override
    public void cookingCappuccino() {
        super.cookingCappuccino();
    }

    //выбор лате или капучино
//    @Override
//    public void choiceTypeCoffee() {
//        super.choiceTypeCoffee();
//    }

    //очистка бака отработанного кофе
    @Override
    public void tankCleaning() {
        super.tankCleaning();
    }

    //добавление молока
    @Override
    public void mySetMilk() {
        super.mySetMilk();
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
