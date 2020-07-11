package com.company.Lesson17.example3;

import com.company.Lesson14.constr.A;
import com.company.Lesson17.example1.Type;
import com.company.Lesson17.example2.Application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class App<T extends Number> {
    T num;

    public App(T num) {
        this.num = num;
    }


    boolean absEquals(App<?> app) {
        if (Math.abs(num.doubleValue()) ==
                Math.abs(app.num.doubleValue())){
            return true;
        }
        return false;
    }

    int sum(Application<?,?>application){
        return application.num.intValue() + num.intValue();
    }

}

class Run{
    public static void main(String[] args) {
        //App<? extends Application<Integer, Integer>> appInt = new App<>();

        App<Double> appDouble = new App<>(12.0);

        Application<Number, Double> application = new Application<Number, Double>(12.5);

        //appInt.absEquals(appDouble);

        //int sum = appInt.sum(application);
        //System.out.println("sum = " + sum);

    }
}
