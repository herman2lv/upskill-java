package com.epam.classes.composition.task2;

public class Wheel {
    private final int radius;
    private boolean isOk;

    public Wheel(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("The radius of wheel should pe greater than zero");
        }
        this.radius = radius;
    }

    public void repair() {
        isOk = true;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isOk() {
        return isOk;
    }
}
