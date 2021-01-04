package com.epam.threads.locker;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockerResource {
    private final StringBuilder content = new StringBuilder();
    private final ReentrantLock lock = new ReentrantLock(true);
    private final Condition condition = lock.newCondition();

    public StringBuilder getContent() {
        return content;
    }

    public void addName() {
        try {
        lock.lock();
            System.out.println("M" + Thread.currentThread().getId() + " started");
            for (int i = 0; i < 5; i++) {
                content.append(Thread.currentThread().getName());
                TimeUnit.MILLISECONDS.sleep(1);
                content.append(" -> ");
                TimeUnit.MILLISECONDS.sleep(1);
                condition.await();
                condition.signal();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void addNumber() {
        try {
            lock.lock();
            System.out.println("M" + Thread.currentThread().getId() + " started");
            for (int i = 0; i < 5; i++) {
                content.append(i);
                TimeUnit.MILLISECONDS.sleep(1);
                content.append('\n');
                TimeUnit.MILLISECONDS.sleep(1);
                condition.signal();
                condition.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
