package com.company.Lesson28;

import com.company.Lesson14.constr.A;

import java.util.concurrent.atomic.AtomicLong;

public class Demo3 {

    public static void main(String[] args) throws Exception {
        concurrencyRace();
    }

    // Демонстрация проблемы борьбы за ресурсы
    private static void concurrencyRace() throws InterruptedException {
        Account account = new Account(100_000);
        System.out.println("Begin balance = " + account.getBalance());

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 20_000; i++) {
                account.withdraw(1);
            }
        });

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 20_000; i++) {
                account.deposit(1);
            }
        });

        withdrawThread.start();
        depositThread.start();

        withdrawThread.join();
        depositThread.join();

        System.out.println("End balance = " + account.getBalance());

    }
}

/**
 * Банковский счет
 */
class Account {

    Object locker = new Object();

    long balance1;

    AtomicLong balance = new AtomicLong();


    public Account(long l) {
        this.setBalance(l);
    }

    public long getBalance() {
        //return balance;
        return balance.get();
    }

    private void setBalance(long balance) {
        //this.balance = balance;
        this.balance.set(balance);

    }

    public synchronized void deposit(long amount) throws IllegalArgumentException {
        checkAmountNonNegative(amount);

        synchronized (locker) {
            //balance += amount;
            balance.getAndAdd(amount);
        }
    }

    private static void checkAmountNonNegative(long amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("negative amount");
        }
    }

    public synchronized void withdraw(long amount) throws IllegalArgumentException {

        checkAmountNonNegative(amount);

        if (balance.get() < amount) {
            throw new IllegalArgumentException("not enough money");
        }


        synchronized (this) {
            //balance -= amount;
            balance.getAndAdd(-amount);
        }
    }
}


