package com.epam.threads.locker;

public class LockerThread extends Thread {
    private final LockerResource lockerResource;

    public LockerThread(LockerResource lockerResource) {
        this.lockerResource = lockerResource;
    }

    @Override
    public void run() {
        lockerResource.addName();
    }
}
