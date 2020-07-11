package com.company.Lesson29;


import java.time.LocalTime;

public class Demo4 {


    public static void main(String[] args) throws InterruptedException {

        Account2 account2 = new Account2(0);

        new Thread(() -> {
            for (int i = 0; i < 50_000_000; i++) {
                account2.deposit(1);
            }
        }).start();

        //Thread.sleep(2000);

        System.out.println("Состояние баланса до снятия  = " + account2.getBalance() + " " + LocalTime.now());

        //Снять деньги
        //account2.withdraw(50_000_000);

        account2.waitAndWithdraw(50_000_000);

        System.out.println("Состояние баланса = " + account2.getBalance() + " "+LocalTime.now());

    }
}

class Account2 {
    private long balance;

    public Account2() {
        this(0L);
    }

    public Account2(long l) {
        this.setBalance(l);
    }

    public long getBalance() {
        return balance;
    }

    private void setBalance(long balance) {
        this.balance = balance;
    }

    public synchronized void deposit(long amount) {
        checkAmountNonNegative(amount);
        balance += amount;
        notify();

    }

    private static void checkAmountNonNegative(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("negative amount");
        }
    }



    public synchronized void waitAndWithdraw(long amount) throws InterruptedException {
        while (balance < amount){
            wait();
        }
        withdraw(amount);
    }


    public synchronized void withdraw(long amount) {
        checkAmountNonNegative(amount);

        if (balance < amount) {
            throw new IllegalArgumentException("not enough money");
        }

        balance -= amount;
    }


}