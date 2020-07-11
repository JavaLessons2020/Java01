package com.company.Lesson29;


public class Demo5 {
    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void seyHi(Friend friend){
            System.out.println(name + " say hi to " + friend.getName());
            friend.hiBack(this);
        }

        public synchronized void hiBack(Friend friend){
            System.out.println(name + " say hi back to me " + friend.getName());
        }

    }


    public static void main(String[] args) {
        Friend petr = new Friend("Petr");
        Friend ivan = new Friend("Ivan");

        new Thread(() -> petr.seyHi(ivan)).start();
        new Thread(() -> ivan.seyHi(petr)).start();

    }
}
