package com.epam.algorithmization.decomposition;

public class Task17 {
    public static void main (String[] args) {
        int number = 946_832_732;
        int numberOfOps = Service.getNumberOfSubtractionsOfSumsOfDigitsToReachZero(number);
        System.out.printf("It's needed to conduct %d of subtractions to reach zero if start with %d", numberOfOps, number);

    }
}