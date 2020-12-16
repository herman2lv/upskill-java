package com.epam.classes.simplestClasses.task5;

public class Counter {
    private final static int DEFAULT_MIN_RANGE = 0;
    private final static int DEFAULT_MAX_RANGE = 99;
    private int counter;
    private final int minRange;
    private final int maxRange;

    public Counter() {
        minRange = DEFAULT_MIN_RANGE;
        counter = minRange;
        maxRange = DEFAULT_MAX_RANGE;
    }

    public Counter(int minRange, int maxRange) {
        this.minRange = minRange;
        this.counter = minRange;
        this.maxRange = maxRange;
        validate();
    }
    public Counter(int minRange, int maxRange, int counterInitialState) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.counter = counterInitialState;
        validate();
    }


    /**
     * Validates range and the position of the counter.
     *
     * @throws IllegalStateException if max range is less than or equal to the min range
     * or counter state is less than the min range
     * or counter state is greater than the max range
     */
    private void validate() {
        if (maxRange <= minRange) {
            throw new IllegalStateException("Max range should be grater than the min range");
        }
        if (counter < minRange || counter > maxRange) {
            throw new IllegalStateException("Counter initial state should be grater than or equal to the min range " +
                    "and less than or equal to the max range");
        }
    }

    public void increment() {
        if (counter == maxRange) {
            counter = minRange;
        } else {
            counter++;
        }
    }
    public void decrement() {
        if (counter == minRange) {
            counter = maxRange;
        } else {
            counter--;
        }
    }

    public boolean isMaxValue() {
        return counter == maxRange;
    }

    public boolean isMinValue() {
        return counter == maxRange;
    }

    public void reset() {
        counter = minRange;
    }

    public void resetToMax() {
        counter = maxRange;
    }

    public int getCounter() {
        return counter;
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }
}
