package com.company.Lesson16.inner;

public class OutApp {
   private int a;

   void printOut(){
       System.out.println("Out");
   }

  class InnerApp {
        public OutApp appMethod() {
            return OutApp.this;
        }
    }

    public InnerApp inner(){
       return new InnerApp();
    }
}


class Run{
    public static void main(String[] args) {
        OutApp app = new OutApp();
        OutApp.InnerApp innerApp = app.inner();
        innerApp.appMethod().printOut();

    }
}


