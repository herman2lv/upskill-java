package com.epam.threads.synchro;

import java.util.concurrent.TimeUnit;

public class ThreadClass extends Thread {
    CommonResource commonResource;

    public ThreadClass(String name, CommonResource commonResource) {
        super(name);
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        synchronized (commonResource) {
            for (int i = 1; i < 6; i++) {
                commonResource.write(getName(), i);
                try {
                    TimeUnit.MILLISECONDS.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
