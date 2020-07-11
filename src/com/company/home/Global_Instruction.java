package com.company.home;

import java.util.Scanner;


public class Global_Instruction extends CoffeeMaсhine {

    public Global_Instruction() {

    }

    public void scan() {
        while (true) {
            int cache = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose type coffee maсhine. Enter 1/2/3.");
            if (scanner.hasNextInt()) {
                cache = scanner.nextInt();
                setCoffeeMaсhine(cache);
                if (cache >= 1 && cache < 4) {
                    break;
                }
            } else {
                System.err.println("You enter not integer number!!!");
            }
        }
    }

//    @Override
//    public void choiceCookingCoffee() {
//
//    }

    public void useObjectCoffeeMaсhine(int type) {
        //кофемашина 1
        if (getCoffeeMaсhine() == 1) {
            CoffeeMaсhine_task1 coffeeMaсhine1 = new CoffeeMaсhine_task1(200, 500, 300, 1000, 0, 600);
            //включение
            coffeeMaсhine1.on();
            if (coffeeMaсhine1.getOn()) {
                //проверка на наличее молотого кофе[0], воды[2], пустого бака отработанного кофе[4]
                if (coffeeMaсhine1.catheWatchCoffee() && coffeeMaсhine1.catheWatchWater() && coffeeMaсhine1.catheWatchWasteCoffee()) {
                    //приготовление кофе
                    while (true) {
                        //выбор и приготовление кофе
                        coffeeMaсhine1.choiceCookingCoffee();
                        //проверка
                        //проверка на отсутствие ингридиентов после варки очередной дозы, и выключение машины при нехватке на дозу
                        // молотого кофе[0], кофе в зернах[1], воды[2], пустого бака отработанного кофе[4]
                        if (!coffeeMaсhine1.catheWatchCoffee()) {
                            System.err.println("There are not coffee!!!");
                            break;
                        }
                        if (!coffeeMaсhine1.catheWatchWater()) {
                            System.err.println("There are not water!!!");
                            break;
                        }
                        if (coffeeMaсhine1.catheWatchWasteCoffee() == false) {
                            System.err.println("Buk waster coffee is full!!!");
                            break;
                        }
                        //кнопка очистки бака с использованным кофе
                        System.out.println("You want cleaning bak waste coffee? Yes/No");
                        while (true) {
                            Scanner scanner = new Scanner(System.in);
                            String data = scanner.next();
                            if (data.equalsIgnoreCase("yes")) {
                                coffeeMaсhine1.tankCleaning();
                                System.out.println("Bak waste coffee " + coffeeMaсhine1.getWasteCoffee());
                                break;
                            } else if (data.equalsIgnoreCase("no")) {
                                System.out.println("Bak waste coffee " + coffeeMaсhine1.getWasteCoffee());
                                break;
                            } else {
                                System.err.println("You enter not correct data!!!");
                            }
                        }
                        //кнопка выключения
                        coffeeMaсhine1.off();
                        if (coffeeMaсhine1.getOff()) {
                            break;
                        }
                    }
                }
            } else {
                System.err.println("You NOT ON coffee maсhine");
            }
            //кофемашина 2
        } else if (getCoffeeMaсhine() == 2) {
            CoffeeMaсhine_task2 coffeeMaсhine2 = new CoffeeMaсhine_task2(200, 600, 300, 1100, 300, 500, 0, 700);
            //включение
            coffeeMaсhine2.on();
            if (coffeeMaсhine2.getOn()) {
                //проверка на наличее молотого кофе[0], воды[2],молока[3], пустого бака отработанного кофе[4]
                if (coffeeMaсhine2.catheWatchCoffee() != false && coffeeMaсhine2.catheWatchWater() != false && coffeeMaсhine2.catheWatchMilk() != false && coffeeMaсhine2.catheWatchWasteCoffee() != false) {
                    //приготовление кофе
                    while (true) {
                        //выбор и приготовление кофе
                        coffeeMaсhine2.choiceCookingCoffee();
                        //проверка
                        //проверка на отсутствие ингридиентов после варки очередной дозы, и выключение машины при нехватке на дозу
                        // молотого кофе[0], кофе в зернах[1], воды[2], молока[3], пустого бака отработанного кофе[4]
                        if (coffeeMaсhine2.catheWatchCoffee() == false) {
                            System.err.println("There are not coffee!!!");
                            break;
                        }
                        if (coffeeMaсhine2.catheWatchWater() == false) {
                            System.err.println("There are not water!!!");
                            break;
                        }
                        if (coffeeMaсhine2.catheWatchMilk() == false) {
                            System.err.println("There are not milk!!!");
                            break;
                        }
                        if (coffeeMaсhine2.catheWatchWasteCoffee() == false) {
                            System.err.println("Buk waster coffee is full!!!");
                            break;
                        }
                        //кнопка очистки бака с использованным кофе
                        System.out.println("You want cleaning bak waste coffee? Yes/No");
                        while (true) {
                            Scanner scanner = new Scanner(System.in);
                            String data = scanner.next();
                            if (data.equalsIgnoreCase("yes")) {
                                coffeeMaсhine2.tankCleaning();
                                System.out.println("Bak waste coffee " + coffeeMaсhine2.getWasteCoffee());
                                break;
                            } else if (data.equalsIgnoreCase("no")) {
                                System.out.println("Bak waste coffee " + coffeeMaсhine2.getWasteCoffee());
                                break;
                            } else {
                                System.err.println("You enter not correct data!!!");
                            }
                        }
                        //кнопка выключения
                        coffeeMaсhine2.off();
                        if (coffeeMaсhine2.getOff()) {
                            break;
                        }
                    }
                }
            } else {
                System.err.println("You NOT ON coffee maсhine");
            }

        } else if (getCoffeeMaсhine() == 3) {
            CoffeeMaсhine_task3 coffeeMaсhine3 = new CoffeeMaсhine_task3(100, 600, 500, 700, 600, 1200, 500, 600, 0, 700);
            //включение
            coffeeMaсhine3.on();
            if (coffeeMaсhine3.getOn()) {
                //проверка на наличее молотого кофе[0],кофе в зернах [1] воды[2],молока[3], пустого бака отработанного кофе[4]
                if (coffeeMaсhine3.catheWatchCoffee() != false && coffeeMaсhine3.catheWatchCoffeeBeans() != false && coffeeMaсhine3.catheWatchWater() != false && coffeeMaсhine3.catheWatchMilk() != false && coffeeMaсhine3.catheWatchWasteCoffee() != false) {
                    //приготовление кофе
                    while (true) {
                        //выбор и приготовление кофе
                        coffeeMaсhine3.choiceCookingCoffee();
                        //помол зернового кофе (если меленого осталось меньше 60гр)
                        coffeeMaсhine3.grindingCoffee();
                        //проверка
                        //проверка на отсутствие ингридиентов после варки очередной дозы, и выключение машины при нехватке на дозу
                        // молотого кофе[0], кофе в зернах[1], воды[2], молока[3], пустого бака отработанного кофе[4]
                        if (coffeeMaсhine3.catheWatchCoffee() == false) {
                            System.err.println("There are not coffee!!!");
                            break;
                        }
                        if (coffeeMaсhine3.catheWatchCoffeeBeans() == false) {
                            System.err.println("There are not coffee!!!");
                            break;
                        }
                        if (coffeeMaсhine3.catheWatchWater() == false) {
                            System.err.println("There are not water!!!");
                            break;
                        }
                        if (coffeeMaсhine3.catheWatchMilk() == false) {
                            System.err.println("There are not milk!!!");
                            break;
                        }
                        if (coffeeMaсhine3.catheWatchWasteCoffee() == false) {
                            System.err.println("Buk waster coffee is full!!!");
                            break;
                        }
                        //кнопка очистки бака с использованным кофе
                        System.out.println("You want cleaning bak waste coffee? Yes/No");
                        while (true) {
                            Scanner scanner = new Scanner(System.in);
                            String data = scanner.next();
                            if (data.equalsIgnoreCase("yes")) {
                                coffeeMaсhine3.tankCleaning();
                                System.out.println("Bak waste coffee " + coffeeMaсhine3.getWasteCoffee());
                                break;
                            } else if (data.equalsIgnoreCase("no")) {
                                System.out.println("Bak waste coffee " + coffeeMaсhine3.getWasteCoffee());
                                break;
                            } else {
                                System.err.println("You enter not correct data!!!");
                            }
                        }
                        //кнопка выключения
                        coffeeMaсhine3.off();
                        if (coffeeMaсhine3.getOff()) {
                            break;
                        }
                    }
                }
            } else {
                System.err.println("You NOT ON coffee maсhine");
            }
        }
    }
}
