package com.epam.threads.wait;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WaitResource resource = new WaitResource();
        Thread thread = new Thread(resource::pay);
        thread.start();
        while (thread.isAlive()) {
            new Thread(resource::addBalance).start();
            try {
                TimeUnit.MILLISECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
