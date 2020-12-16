package com.epam.threads.init;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class ThreadViaCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            System.out.println("\t\tCallable " + i);
            result.append("Callable ").append(i).append('\n');
            try {
                TimeUnit.MILLISECONDS.sleep(Main.iterationInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result.toString();
    }
}
