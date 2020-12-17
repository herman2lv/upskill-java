package com.epam.classes.simplest.task4;

import java.util.Comparator;
import java.util.List;

public class TrainService {
    public void sortByNumber(List<Train> trains) {
        trains.sort(new Train.NumberComparator());
    }

    public void sortByDestination(List<Train> trains) {
        trains.sort(Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
    }

    public Train getTrainByNumber(List<Train> trains, int number) {
        for (Train train: trains) {
            if (train.getNumber() == number) {
                return train;
            }
        }
        return null;
    }
}
