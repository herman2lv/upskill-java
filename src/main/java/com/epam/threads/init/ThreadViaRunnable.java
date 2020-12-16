package com.epam.threads.init;

import java.util.concurrent.TimeUnit;

public class ThreadViaRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 12; i++) {
            System.out.println("\tRunnable " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(Main.iterationInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
