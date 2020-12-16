package com.epam.basics.branching;

public class Brick {
    private int height = 5;
    private int width = 10;
    private int length = 30;

    public Brick() {
    }

    public Brick(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public void printSize() {
        System.out.printf("The brick's size is %dx%dx%dcm\n", length, width, height);
    }
}
