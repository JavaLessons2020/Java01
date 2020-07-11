package com.company.home;

import java.util.Scanner;

public abstract class CoffeeMaсhine {
    private int coffee;         //запас молотого кофе в кофемашине
    private int maxCoffee;      //МАХ объем бака для молотого кофе
    private int coffeeBeans;    //запас кофе в зернах
    private int maxCoffeeBeans;  //МАХ объем бака для зернового кофе
    private int water;          //запас воды в кофемашине
    private int maxWater;       //МАХ объем бака для воды
    private int milk;           //запас молока в кофемашине
    private int maxMilk;        //МАХ объем бака для молока
    private int typeCoffee;      //количество частей кофе для лате(2 части) или капучино(1 часть)
    private int wasteCoffee;    //отработанный кофе
    private int maxWasteCoffee; //мах количество отработанного кофе в спец баке
    private boolean on;         //включение кофемашины
    private boolean off;        //выключение кофемашины
    private int coffeeMaсhine;  //модель кофемашины
    //массив содержащий результаты проверок
    //[0]молотое кофе
    //[1]кофе в зернах
    //[2]вода
    //[3]молоко
    //[4]бак с отработаным кофе
    private boolean myCatch[] = new boolean[5];


    public CoffeeMaсhine() {

    }

    /*Конструктор для кофемашины Задание 1 */
    public CoffeeMaсhine(int coffee, int maxCoffee, int water, int maxWater, int wasteCoffee, int maxWasteCoffee) {
        this.coffee = coffee;
        this.maxCoffee = maxCoffee;
        this.water = water;
        this.maxWater = maxWater;
        this.wasteCoffee = wasteCoffee;
        this.maxWasteCoffee = maxWasteCoffee;
    }

    /*Конструктор для кофемашины Задание 2 */
    public CoffeeMaсhine(int coffee, int maxCoffee, int water, int maxWater, int milk, int maxMilk, int wasteCoffee, int maxWasteCoffee) {
        this.coffee = coffee;
        this.maxCoffee = maxCoffee;
        this.water = water;
        this.maxWater = maxWater;
        this.milk = milk;
        this.maxMilk = maxMilk;
        this.wasteCoffee = wasteCoffee;
        this.maxWasteCoffee = maxWasteCoffee;
    }

    /*Конструктор для кофемашины Задание 3 */
    public CoffeeMaсhine(int coffee, int maxCoffee, int coffeeBeans, int maxCoffeeBeans, int water, int maxWater, int milk, int maxMilk, int wasteCoffee, int maxWasteCoffee) {
        this.coffee = coffee;
        this.maxCoffee = maxCoffee;
        this.coffeeBeans = coffeeBeans;
        this.maxCoffeeBeans = maxCoffeeBeans;
        this.water = water;
        this.maxWater = maxWater;
        this.milk = milk;
        this.maxMilk = maxMilk;
        this.wasteCoffee = wasteCoffee;
        this.maxWasteCoffee = maxWasteCoffee;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        if (coffee >= 0) {
            this.coffee = coffee;
        } else {
            System.err.println("Coffee must be >= 0!!!");
        }
    }

    public int getMaxCoffee() {
        return maxCoffee;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        if (water >= 0) {
            this.water = water;
        } else {
            System.err.println("Water must be >= 0!!!");
        }
    }

    public int getMaxWater() {
        return maxWater;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        if (milk >= 0) {
            this.milk = milk;
        } else {
            System.err.println("Milk must be >= 0!!!");
        }
    }

    public int getMaxMilk() {
        return maxMilk;
    }

    public int getWasteCoffee() {
        return wasteCoffee;
    }

    public void setWasteCoffee(int wasteCoffee) {
        if (wasteCoffee >= 0) {
            this.wasteCoffee = wasteCoffee;
        } else {
            System.err.println("Waste coffee must be >= 0!!!");
        }
    }

    public int getMaxWasteCoffee() {
        return maxWasteCoffee;
    }

    public void setMaxWasteCoffee(int maxWasteCoffee) {
        if (maxWasteCoffee > 0) {
            this.maxWasteCoffee = maxWasteCoffee;
        } else {
            System.err.println("MAX waste coffee must be >= 0!!!");
        }
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        if (coffeeBeans >= 0) {
            this.coffeeBeans = coffeeBeans;
        } else {
            System.err.println("Coffee's beans must be >= 0!!!");
        }
    }

    public int getMaxCoffeeBeans() {
        return maxCoffeeBeans;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOff() {
        return off;
    }

    public void setOff(boolean off) {
        this.off = off;
    }

    public int getTypeCoffee() {
        return typeCoffee;
    }

    public void setTypeCoffee(int typeCoffee) {
        this.typeCoffee = typeCoffee;
    }

    public int getCoffeeMaсhine() {
        return coffeeMaсhine;
    }

    public void setCoffeeMaсhine(int coffeeMaсhine) {
        if (coffeeMaсhine >= 1 && coffeeMaсhine < 4) {
            this.coffeeMaсhine = coffeeMaсhine;
        } else {
            System.err.println("Model coffee maсhine may be only 1 or 2 or3!!!");
        }
    }

    public boolean[] getMyCatch() {
        return myCatch;
    }

    public void setMyCatch(boolean[] myCatch) {
        this.myCatch = myCatch;
    }

    //включение кофемашины
    public void on() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You want ON coffee maсhine? Enter Yes/No");
            String myOn = scanner.next();
            if (myOn.equalsIgnoreCase("yes")) {
                System.out.println("Machine ON");
                setOn(true);
                break;
            } else if (myOn.equalsIgnoreCase("no")) {
                System.out.println("Machine is not ON");
                break;
            } else {
                System.err.println("You enter not correct data!!!");
            }
        }
    }

    //выключение кофемашины
    public void off() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You want OFF coffee maсhine? Enter Yes/No");
            String myOn = scanner.next();
            if (myOn.equalsIgnoreCase("yes")) {
                System.out.println("Machine OFF");
                off = true;
                break;
            } else if (myOn.equalsIgnoreCase("no")) {
                System.out.println("Machine is not OFF");
                off = false;
                break;
            } else {
                System.err.println("You enter not correct data!!!");
            }

        }
    }

    // очистка бака отработанного кофе
    public void tankCleaning() {
        setWasteCoffee(0);
    }

    //Приготовить эспрессо
    public void cookingEspresso() {
        setCoffee(getCoffee() - 22);
        setWater(getWater() - 30);
        //при приготовлении порции экспрессо получаеться 22 гр отработанного кофе
        setWasteCoffee(getWasteCoffee() + 22);
    }

    //Приготовить американо
    public void cookingAmericano() {
        setCoffee(getCoffee() - 22);
        setWater(getWater() - 100);
        //при приготовлении порции американо получаеться 22 гр отработанного кофе
        setWasteCoffee(getWasteCoffee() + 22);
    }

    //Приготовить лате (2 части молока)
    public void cookingLate() {
        setCoffee(getCoffee() - 22);
        setWater(getWater() - 30);
        setMilk(getMilk() - 60);
        //при приготовлении порции лате получаеться 22 гр отработанного кофе
        setWasteCoffee(getWasteCoffee() + 22);
    }

    //Приготовить капучино (1 части молока)
    public void cookingCappuccino() {
        setCoffee(getCoffee() - 22);
        setWater(getWater() - 30);
        setMilk(getMilk() - 30);
        //при приготовлении порции капучино получаеться 22 гр отработанного кофе
        setWasteCoffee(getWasteCoffee() + 22);
    }

    //выбор лате или капучино
//    public void choiceTypeCoffee() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Do you want Late(2 parts milk) or Cappuccino(1 part milk)? Enter 1/2!");
//        if (scanner.hasNextInt()) {
//            setPartsMilk(scanner.nextInt());
//            if (getPartsMilk() == 1) {
//                cookingCappuccino();
//            } else if (getPartsMilk() == 2) {
//                cookingLate();
//            } else {
//                //введенные значения != 1 или 2
//                System.out.println("Ты не можешь определиться с молоком?))) choiceTypeCoffee()");
//                choiceTypeCoffee();
//            }
//        }
//    }

    //помол зернового кофе
    //За один раз кофемашина мелет 110грм зернового кофе.
    public void grindingCoffee() {
        if(getCoffee()<=60) {
            if (getCoffeeBeans() >= 110) {
                setCoffee(getCoffee() + 110);
                setCoffeeBeans(getCoffeeBeans() - 110);
                //если в ваке с зерновым кофе < 110 грм
            } else if (getCoffeeBeans() < 110) {
                setCoffee(getCoffee() + getCoffeeBeans());
                setCoffeeBeans(0);
            }
        }
    }

    //добавление молотого кофе
    public void mySetCoffee() {
        int cache = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You want add coffee in maсhine? Enter Yes/No");
            String string = scanner.next();
            if (string.equalsIgnoreCase("yes")) {
                System.out.println("Enter value added coffee");
                Scanner scan = new Scanner(System.in);
                if (scan.hasNextInt()) {
                    cache = scan.nextInt();
                    if (cache + getCoffee() > getMaxCoffee()) {
                        //сумма добавленного кофе и остатка в баке больше мах размера бака - часть кофе потеряно
                        setCoffee(getMaxCoffee());
                        System.err.println("You lose part coffee!!! MAX value < balance + coming!!!");
                    } else if (cache + getCoffee() <= getMaxCoffee()) {
                        //все добавленое кофе помистилось в бак
                        setCoffee(cache + getCoffee());
                    }
                }
                System.out.println("Coffee is " + getCoffee());
                break;
            } else if (string.equalsIgnoreCase("no")) {
                System.err.println("Machine there is not coffee!");
            } else {
                System.err.println("Ты не можешь определиться с количеством молотого кофe?))) mySetCoffee()");
            }
        }
    }

    //добавление зернового кофе
    public void mySetCoffeeBeans() {
        int cache = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You want add coffee'sbeans in maсhine? Enter Yes/No");
            String string = scanner.next();
            if (string.equalsIgnoreCase("yes")) {
                System.out.println("Enter value added coffee's beans");
                Scanner scan = new Scanner(System.in);
                if (scan.hasNextInt()) {
                    cache = scan.nextInt();
                    if (cache + getCoffeeBeans() > getMaxCoffeeBeans()) {
                        //сумма добавленного кофе и остатка в баке больше мах размера бака - часть кофе потеряно
                        setCoffee(getMaxCoffee());
                        System.err.println("You lose part coffee's beans!!! MAX value < balance + coming!!!");
                    } else if (cache + getCoffeeBeans() <= getMaxCoffeeBeans()) {
                        //все добавленое кофе помистилось в бак
                        setCoffeeBeans(cache + getCoffeeBeans());
                    }
                }
                System.out.println("Coffee is " + getCoffeeBeans());
                break;
            } else if (string.equalsIgnoreCase("no")) {
                System.err.println("Machine there is not coffee's beans!");
            } else {
                System.err.println("Ты не можешь определиться с зерновым кофе?))) mySetCoffeeBeans()");
            }
        }
    }

    //добавление воды
    public void mySetWater() {
        int cache = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You want add water in maсhine? Enter Yes/No");
            String string = scanner.next();
            if (string.equalsIgnoreCase("yes")) {
                System.out.println("Enter value added water");
                Scanner scan = new Scanner(System.in);
                if (scan.hasNextInt()) {
                    cache = scan.nextInt();
                    if (cache + getWater() > getMaxWater()) {
                        //сумма добавленноу воды и остатка в баке больше мах размера бака - часть воды потеряно
                        setWater(getMaxWater());
                        System.err.println("You lose part water!!! MAX value < balance + coming!!!");
                    } else if (cache + getWater() <= getMaxWater()) {
                        //вся добавленая вода помистилась в бак
                        setWater(cache + getWater());
                    }
                }
                System.out.println("Water is " + getWater());
                break;
            } else if (string.equalsIgnoreCase("no")) {
                System.err.println("Machine there is not water!");
            } else {
                System.err.println("Ты не можешь определиться с водой?))) mySetWater()");
            }
        }
    }

    //добавление молока
    public void mySetMilk() {
        int cache = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You want add milk in maсhine? Enter Yes/No");
            String string = scanner.next();
            if (string.equalsIgnoreCase("yes")) {
                System.out.println("Enter value added milk");
                Scanner scan = new Scanner(System.in);
                if (scan.hasNextInt()) {
                    cache = scan.nextInt();
                    if (cache + getMilk() > getMaxMilk()) {
                        //сумма добавленноу воды и остатка в баке больше мах размера бака - часть воды потеряно
                        setWater(getMaxMilk());
                        System.err.println("You lose part water!!! MAX value < balance + coming!!!");
                    } else if (cache + getMilk() <= getMaxMilk()) {
                        //вся добавленая вода помистилась в бак
                        setWater(cache + getMilk());
                    }
                }
                System.out.println("Water is " + getMilk());
                break;
            } else if (string.equalsIgnoreCase("no")) {
                System.err.println("Machine there is not milk!");
            } else {
                System.err.println("Ты не можешь определиться с молоком?))) mySetMilk()");
            }
        }
    }

    //проверка - Отсутствует молотое кофе/только вывод сообщения в консоль.
    //если меньше 22грм - кофе сварить нельзя
    public boolean catheWatchCoffee() {
        if (getCoffee() < 22) {
            System.err.println("There is not coffee!");
            return false;
        }
        System.out.println("Coffee is OK " + getCoffee());
        return  true;
    }

    //проверка - Отсутствует зерновое кофе/только вывод сообщения в консоль.
    //молоть кофе меньше чем на пять порций нет смысла
    public boolean catheWatchCoffeeBeans() {
        if (getCoffeeBeans() <= 50) {
            System.err.println("There is not coffee's beans!");
            return false;
        }
        System.out.println("Coffee's beans is OK " + getCoffeeBeans());
        return true;
    }

    //проверка - Отсутствует вода/только вывод сообщения в консоль.
    //если меньше 30грм - кофе сварить нельзя
    public boolean catheWatchWater() {
        if (getWater() < 100) {
            System.err.println("There is not water! ");
            return false;
        }
        System.out.println("Water is OK " + getWater());
        return true;
    }

    //проверка - Отсутствует молоко/только вывод сообщения в консоль.
    //если меньше 60грм - капучино сварить нельзя
    public boolean catheWatchMilk() {
        if (getMilk() < 60) {
            System.err.println("There is not milk! ");
            return false;
        }
        System.out.println("Milk is OK " + getMilk());
        return true;
    }

    //проверка - переполнен бак отработонного кофе/только вывод сообщения в консоль.
    public boolean catheWatchWasteCoffee() {
        if (getWasteCoffee() > getMaxWasteCoffee()) {
            System.err.println("Bak with waste coffee is full!");
            return false;
        }
        System.out.println("Bak with waste coffee is empty " + (getMaxWasteCoffee() - getWasteCoffee()));
        return true;
    }

    //выбор приготовляемого кофе
    public void choiceCookingCoffee() {

    }
}

