package com.epam.classes.composition.task3;

import java.util.Arrays;
import java.util.Collections;

public class Task3Main {
    public static void main(String[] args) {
        City city1 = new City("Staroe Syalo", 30_000);
        City city2 = new City("Novoe Syalo", 30_000);
        City city3 = new City("Ivie", 30_000);
        District district1 = new District("Ivievski", city3, Arrays.asList(city2, city1), 14_300);
        City city4 = new City("Verhnie Toki", 50_000);
        City city5 = new City("Nizhnie Toki", 50_000);
        City city6 = new City("Lida", 50_000);
        District district2 = new District("Lidski", city6, Arrays.asList(city5, city4), 23_600);
        City city7 = new City("Hrodna", 500_000);
        Region region1 = new Region("Hrodnenskaya", city7, Arrays.asList(district1, district2));
        City city8 = new City("Bolshie Mudi", 100_000);
        City city9 = new City("Malye Mudi", 100_000);
        City city10 = new City("Pinsk", 100_000);
        District district3 = new District("Pinski", city10, Arrays.asList(city9, city8), 18_100);
        City city11 = new City("Brest", 550_000);
        Region region2 = new Region("Brestskaya", city11, Collections.singletonList(district3));
        City city12 = new City("Minsk", 1_000_000);
        State state = new State("Veishnoriya", city12, Arrays.asList(region1, region2));
        System.out.printf("The Capital city is: %s%n", state.getCapitalName());
        System.out.printf("The area of the country is: %d sq.km%n", state.getArea());
        System.out.printf("The number of regions of the country is: %d%n", state.getNumberOfRegions());
        System.out.printf("The centers of the regions are: %s%n", state.getRegionCenters());
    }
}
