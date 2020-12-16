package com.epam.threads.parking;

import com.epam.threads.parking.dao.CarDAO;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        CarDAO carDAO = new CarDAO();
        Thread t1 = new Thread(() -> {
            List<Car> cars = carDAO.getCars();
            cars.sort(Comparator.comparing(Car::getNumber));
            for (Car car : cars) {
                parking.parkCar(car);
            }
        });
        t1.start();
        try {
            TimeUnit.MILLISECONDS.sleep(450);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 17; i++) {
                parking.getRidOfCar();
            }
        });
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(parking.getParkedCars());
    }
}
