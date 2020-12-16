package com.epam.threads.parking.dao;

import com.epam.threads.parking.Car;
import com.epam.threads.parking.enums.CarModel;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {
    private final List<Car> cars = new ArrayList<>();

    public CarDAO() {
        cars.add(new Car(CarModel.AUDI, "0208"));
        cars.add(new Car(CarModel.AUDI, "0458"));
        cars.add(new Car(CarModel.AUDI, "7852"));
        cars.add(new Car(CarModel.AUDI, "7965"));
        cars.add(new Car(CarModel.AUDI, "4578"));
        cars.add(new Car(CarModel.MERCEDES, "4512"));
        cars.add(new Car(CarModel.MERCEDES, "8763"));
        cars.add(new Car(CarModel.MERCEDES, "5473"));
        cars.add(new Car(CarModel.MERCEDES, "7861"));
        cars.add(new Car(CarModel.MERCEDES, "5457"));
        cars.add(new Car(CarModel.VOLVO, "7854"));
        cars.add(new Car(CarModel.VOLVO, "4579"));
        cars.add(new Car(CarModel.VOLVO, "9874"));
        cars.add(new Car(CarModel.VOLVO, "9534"));
        cars.add(new Car(CarModel.VOLVO, "0244"));
        cars.add(new Car(CarModel.NISSAN, "0040"));
        cars.add(new Car(CarModel.NISSAN, "0740"));
        cars.add(new Car(CarModel.NISSAN, "5245"));
        cars.add(new Car(CarModel.NISSAN, "3214"));
        cars.add(new Car(CarModel.NISSAN, "5448"));
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }
}
