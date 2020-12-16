package com.epam.classes.simplestClasses.task4;

import com.epam.basics.cycles.NumberService;
import java.util.ArrayList;
import java.util.List;

public class Task4Main {
    public static void main(String[] args) {
        Train train1 = new Train(581, "Rostov", "11.00");
        Train train2 = new Train(100, "Moscow", "16.00");
        Train train3 = new Train(114, "Warsaw", "15.20");
        Train train4 = new Train(96, "Warsaw", "18.17");
        Train train5 = new Train(300, "Moscow", "15.20");
        List<Train> trains = new ArrayList<>();
        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);
        System.out.printf("Initial list of trains %s\n", trains);

        TrainService trainService = new TrainService();
        trainService.sortByNumber(trains);
        System.out.printf("\nList of trains, sorted by number %s\n", trains);

        trainService.sortByDestination(trains);
        System.out.printf("\nList of trains, sorted by destination %s\n", trains);

        NumberService numberService = new NumberService();
        System.out.print("\nPlease, enter the number of train you would like to chose: ");
        int number = numberService.getIntFomConsole();
        System.out.println(trainService.getTrainByNumber(trains, number));
    }
}
