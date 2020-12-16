package com.epam.classes.aggregationAndComposition.Task2;

public class Task2Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Audi A8L");
        Engine engine = new Engine();
        car.setEngine(engine);
        car.repairEngine();
        Wheel wheel1 = new Wheel(19);
        Wheel wheel2 = new Wheel(19);
        Wheel wheel3 = new Wheel(19);
        Wheel wheel4 = new Wheel(19);
        car.setWheels(wheel1, wheel2, wheel3, wheel4);
        car.repairWheels();
        System.out.printf("The car is \"%s\"\n", car.getModel());
        car.drive();
    }
}
