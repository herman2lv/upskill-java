package com.epam.threads.init;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    static final int ITERATION_INTERVAL = 500;

    public static void main(String[] args) {
        Thread thClass = new ThreadViaClass();
        Thread thRun = new Thread(new ThreadViaRunnable());
        thRun.setDaemon(true);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        thClass.start();
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thRun.start();
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.submit(new ThreadViaCallable());
        executorService.shutdown();


    }
}
