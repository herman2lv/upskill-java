package com.epam.threads.wait;

public class WaitResource {
    private int amount;
    public synchronized void pay() {
        System.out.println("Pay start");
        System.out.println(amount);
        for (int i = 0; i < 10; i++) {
            while (amount <= 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            amount--;
            System.out.println(amount);
        }
        System.out.println("Pay finished");
    }

    public synchronized void addBalance() {
        amount += 100;
        System.out.println("Balance was increased by 100");
        notify();
    }
}
