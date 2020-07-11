package com.company.Lesson16.inner;

public class OutNew {

    public class InnerNew{}


//    public InnerNew inner(){
//        return new InnerNew();
//    }

    public static void main(String[] args) {
     OutNew outNew = new OutNew();
     OutNew.InnerNew innerNew = outNew.new InnerNew();
    }
}

