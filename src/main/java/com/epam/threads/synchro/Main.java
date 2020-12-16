package com.epam.threads.synchro;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        Thread thread1 = new ThreadClass("First", commonResource);
        Thread thread2 = new ThreadClass("\t\tSecond", commonResource);
        thread1.start();
        thread2.start();
        try {
            TimeUnit.MILLISECONDS.sleep(2100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(commonResource.builder);


    }

}
