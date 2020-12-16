package com.epam.threads.parking;

import com.epam.threads.parking.enums.CarModel;

public class Car {
    private final CarModel model;
    private final String number;

    public Car(CarModel model, String number) {
        this.model = model;
        this.number = number;
    }

    public CarModel getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", number='" + number + '\'' +
                '}';
    }
}
