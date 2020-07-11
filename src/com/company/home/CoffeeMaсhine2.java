package com.company.home;

public interface CoffeeMaсhine2 {
    //проверки
    public boolean catheWatchCoffee();

    public boolean catheWatchWater();

    public boolean catheWatchWasteCoffee();

    public boolean catheWatchMilk();

    //кнопки
    public void on();
    public void off();
    public void cookingEspresso();
    public void cookingAmericano();

    //выбор лате или капучино
    //public void choiceTypeCoffee();


    //Приготовить лате (2 части молока)
    public void cookingLate();
    //Приготовить капучино (1 части молока)
    public void cookingCappuccino();
    //Чистка контейнера с отработтаным кофе
    public void tankCleaning();


    //добавление молотого кофе
    public void mySetCoffee();
    //добавление воды
    public void mySetWater();
    //добавление молока
    public void mySetMilk();
    //выбор приготовляемого кофе
    public void choiceCookingCoffee();



}
