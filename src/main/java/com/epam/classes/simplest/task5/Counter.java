package com.epam.classes.simplest.task5;

public class Counter {
    private static final int DEFAULT_MIN_RANGE = 0;
    private static final int DEFAULT_MAX_RANGE = 99;
    private int counterValue;
    private final int minRange;
    private final int maxRange;

    public Counter() {
        minRange = DEFAULT_MIN_RANGE;
        counterValue = DEFAULT_MIN_RANGE;
        maxRange = DEFAULT_MAX_RANGE;
    }

    public Counter(int minRange, int maxRange) {
        this.minRange = minRange;
        this.counterValue = minRange;
        this.maxRange = maxRange;
        validate();
    }
    public Counter(int minRange, int maxRange, int counterInitialState) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.counterValue = counterInitialState;
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
        if (counterValue < minRange || counterValue > maxRange) {
            throw new IllegalStateException("Counter initial state should be grater than or equal to the min range "
                    + "and less than or equal to the max range");
        }
    }

    public void increment() {
        if (counterValue == maxRange) {
            counterValue = minRange;
        } else {
            counterValue++;
        }
    }
    public void decrement() {
        if (counterValue == minRange) {
            counterValue = maxRange;
        } else {
            counterValue--;
        }
    }

    public boolean isMaxValue() {
        return counterValue == maxRange;
    }

    public boolean isMinValue() {
        return counterValue == maxRange;
    }

    public void reset() {
        counterValue = minRange;
    }

    public void resetToMax() {
        counterValue = maxRange;
    }

    public int getCounterValue() {
        return counterValue;
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }
}
