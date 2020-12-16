package com.epam.threads.locker;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        LockerResource resource = new LockerResource();
        Thread t1 = new LockerThread(resource);
        Thread t2 = new Thread(resource::addNumber);
        t1.start();
        t2.start();
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(resource.content);
    }
}
