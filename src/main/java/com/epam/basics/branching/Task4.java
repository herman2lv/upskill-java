package com.epam.basics.branching;

public class Task4 {
    public static void main(String[] args) {
        int frameHeight = 10;
        int frameWidth = 15;
        System.out.printf("The frame's size is %dx%dcm%n", frameWidth, frameHeight);
        Brick brick = new Brick();
        brick.printSize();
        BrickService brickService = new BrickService();
        if (brickService.checkIsInFrame(brick, frameHeight, frameWidth)) {
            System.out.println("It is possible to push the brick through the frame");
        } else {
            System.out.println("It is impossible to push the brick through the frame");
        }
    }
}

