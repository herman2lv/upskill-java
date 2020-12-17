package com.epam.threads.init;

import java.util.concurrent.TimeUnit;

public class ThreadViaClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Class " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(Main.ITERATION_INTERVAL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
