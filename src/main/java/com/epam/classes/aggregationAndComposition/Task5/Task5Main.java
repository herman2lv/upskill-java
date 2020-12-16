package com.epam.classes.aggregationAndComposition.Task5;

import java.util.List;

public class Task5Main {
    public static void main(String[] args) {
        TourService tourService = new TourService();
        TourDAO tourDAO = new TourDAO();
        List<Tour> tours = tourDAO.getTours();
        System.out.printf("\nList of tours: %s\n", tours);
        tourService.sortByDuration(tours);
        System.out.printf("\nList of tours sorted by duration: %s\n", tours);
        tourService.sortByPrice(tours);
        System.out.printf("\nList of tours sorted by price: %s\n", tours);
        Country searchCountry = Country.GERMANY;
        System.out.printf("\nList of tours selected by country: %s\n",
                tourService.getToursByCountry(tours, searchCountry));
        int minDuration = 7;
        int maxDuration = 14;
        System.out.printf("\nList of tours selected by duration: %s\n",
                tourService.getToursByDuration(tours, minDuration, maxDuration));
        int maxPrice = 500;
        System.out.printf("\nList of tours selected by price: %s\n",
                tourService.getToursByPrice(tours, maxPrice));
        TourType searchType = TourType.SHOPPING;
        System.out.printf("\nList of tours selected by type: %s\n",
                tourService.getToursByType(tours, searchType));
        Transport searchTransport = Transport.COACH;
        System.out.printf("\nList of tours selected by transport: %s\n",
                tourService.getToursByTransport(tours, searchTransport));
        Meals searchMeals = Meals.NONE;
        System.out.printf("\nList of tours selected by meals: %s\n",
                tourService.getToursByMeals(tours, searchMeals));
        System.out.printf("\nList of tours selected by country and price: %s\n",
                tourService.getToursByPrice(tourService.getToursByCountry(tours, searchCountry), maxPrice));
    }
}
