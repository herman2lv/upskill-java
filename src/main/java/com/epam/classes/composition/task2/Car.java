package com.epam.classes.composition.task2;

public class Car {
    private static final int NUMBER_OF_WHEELS = 4;
    private String model;
    private Engine engine;
    private final Wheel[] wheels = new Wheel[NUMBER_OF_WHEELS];

    public void drive() {
        if (!checkWheels()) {
            throw new IllegalStateException("Wheels is not ready for the ride");
        }
        if (!checkEngine()) {
            throw new IllegalStateException("Engine is not ready for the ride");
        }
        engine.start();
        System.out.println("Operation (to drive) completed successfully");
        engine.off();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getEngineModel() {
        return engine.getModel();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void repairEngine() {
        engine.repair();
    }

    public void repairWheels() {
        for (Wheel wheel: wheels) {
            wheel.repair();
        }
    }

    public void setWheels(Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4) {
        wheels[0] = wheel1;
        wheels[1] = wheel2;
        wheels[2] = wheel3;
        wheels[3] = wheel4;
    }

    /**
     * Allows to replace certain wheel of the car.
     *
     * @param position - stands for the position of wheel, accepts numbers from 0 to 3
     * @param wheel - accepts the Wheel that will be set up
     *
     * @throws IndexOutOfBoundsException if position is less than 0 or greater than 3
     */
    public void setWheel(int position, Wheel wheel) {
        if (position < 0 || position > wheels.length) {
            throw new IndexOutOfBoundsException("Position should be in a range from 0 to 3");
        }
        wheels[position] = wheel;
    }

    public boolean checkEngine() {
        if (engine == null) {
            return false;
        }
        return engine.isOk();
    }

    public boolean checkWheels() {
        for (Wheel wheel: wheels) {
            if (wheel == null) {
                return false;
            }
            if (!wheel.isOk()) {
                return false;
            }
        }
        return true;
    }
}
