package com.epam.classes.simplest.task4;

import java.util.Comparator;

public class Train {
    private final String destination;
    private final int number;
    private final String departureTime;

    public Train(int number, String destination, String departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "\nTrain{" +
                "destination='" + destination + '\'' +
                ",\tnumber=" + number +
                ",\tdepartureTime='" + departureTime + '\'' +
                '}';
    }

    public static class NumberComparator implements Comparator<Train> {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.getNumber() - o2.getNumber();
        }
    }
}
