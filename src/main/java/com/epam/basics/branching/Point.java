package com.epam.basics.branching;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void generateCoordinates() {
        Random random = new Random();
        x = random.nextInt(20) - 10;
        y = random.nextInt(20) - 10;
    }

    public void generateCoordinates(int absoluteLimit) {
        absoluteLimit = Math.abs(absoluteLimit);
        Random random = new Random();
        x = random.nextInt(absoluteLimit * 2) - absoluteLimit;
        y = random.nextInt(absoluteLimit * 2) - absoluteLimit;
    }

    public void printCoordinates() {
        System.out.printf("x = %d, y = %d", x, y);
    }

    public void printCoordinates(String pointName) {
        System.out.printf("The coordinates of the point '%s' are:\n", pointName);
        System.out.printf("x = %d, y = %d\n", x, y);
    }
}
