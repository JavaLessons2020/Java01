package com.company.home;

public interface CoffeeMaсhine1 {

    //проверки
    public boolean catheWatchCoffee();

    public boolean catheWatchWater();

    public boolean catheWatchWasteCoffee();

    //кнопки
    public void on();
    public void off();
    public void cookingEspresso();
    public void cookingAmericano();
    //Чистка контейнера с отработтаным кофе
    public void tankCleaning();


    //добавление молотого кофе
    public void mySetCoffee();
    //добавление воды
    public void mySetWater();
    //выбор приготовляемого кофе
    public void choiceCookingCoffee();

}
