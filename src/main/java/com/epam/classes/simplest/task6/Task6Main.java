package com.epam.classes.simplest.task6;

public class Task6Main {
    public static void main(String[] args) {
        TimeCounter time = new TimeCounter();
        time.printTime();
        time = new TimeCounter(1000, 62, 3661);
        time.printTime();
        time.setHours(24);
        time.printTime();
        time.setMinutes(-24);
        time.printTime();
        time.setSeconds(3600);
        time.printTime();
        time.setTime(14, 20, 3600);
        time.printTime();
        time.addTime(0, 0, 3599);
        time.printTime();
        time.addTime(-10, -60, -3599);
        time.printTime();
    }
}
