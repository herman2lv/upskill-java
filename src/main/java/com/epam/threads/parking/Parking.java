package com.epam.threads.parking;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Parking {
    private final BlockingQueue<Car> parkedCars = new LinkedBlockingQueue<>(5);

    public void parkCar(Car car) {
        try {
            if (parkedCars.offer(car, 400, TimeUnit.MILLISECONDS)) {
                System.out.println("Have put:" + car);
            } else {
                System.out.println("CANNOT: " + car);
            }
            TimeUnit.MILLISECONDS.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getRidOfCar() {
        try {
            System.out.println("\t\tRemoved:" + parkedCars.take());
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public BlockingQueue<Car> getParkedCars() {
        return parkedCars;
    }
}
