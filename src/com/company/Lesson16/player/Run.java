package com.company.Lesson16.player;

public class Run {
    public void run() {
        ToyCar car1 = new ToyCar(12,34);
        ToyCar car2 = new ToyCar(23,15);



        Player mike = new Player("Mike", "Ivanov");
        //связь один к одному
        mike.setToyCar(car1);
        car1.setPlayer(mike);
        System.out.println(mike);//toString работает по умолчанию
        mike.start(100);
        System.out.println(mike);//toString работает по умолчанию

    }
}
