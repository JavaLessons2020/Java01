package com.company.home;

public interface CoffeeMaсhine3 {

    //проверки
    public boolean catheWatchCoffee();

    public boolean catheWatchWater();

    public boolean catheWatchWasteCoffee();

    public boolean catheWatchMilk();

    //проверка - Отсутствует зерновое кофе
    public boolean catheWatchCoffeeBeans();


    //кнопки
    public void on();
    public void off();

    //приготовить американо
    public void cookingAmericano();

    //Приготовить лате (2 части молока)
    public void cookingLate();

    //Чистка контейнера с отработтаным кофе
    public void tankCleaning();


    //добавление молотого кофе
    public void mySetCoffee();

    //добавление воды
    public void mySetWater();

    //добавление молока
    public void mySetMilk();

    //добавление зернового кофе
    public void mySetCoffeeBeans();

    //выбор приготовляемого кофе
    public void choiceCookingCoffee();


}
