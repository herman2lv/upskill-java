package com.epam.classes.simplest.task5;

public class Task5Main {
    public static void main(String[] args) {
        Counter counter = new Counter(1, 10, 9);
        System.out.printf("Initial counter position is %d, range is from %d to %d%n",
                counter.getCounterValue(), counter.getMinRange(), counter.getMaxRange());
        counter.increment();
        System.out.printf("Counter was incremented. Actual counter position is %d%n", counter.getCounterValue());
        counter.increment();
        System.out.printf("Counter was incremented and it has exceeded it's limit. Actual counter position is %d%n",
                counter.getCounterValue());
        counter.increment();
        System.out.printf("Counter was incremented. Actual counter position is %d%n", counter.getCounterValue());
        counter.decrement();
        System.out.printf("Counter was decremented. Actual counter position is %d%n", counter.getCounterValue());
        while (!counter.isMaxValue()) {
            counter.increment();
            System.out.println("Counter was incremented");
        }
        System.out.printf("Counter has reached max value (%d)%n", counter.getMaxRange());
        counter.reset();
        System.out.printf("Counter was set up to the min value (%d)", counter.getCounterValue());
    }
}
