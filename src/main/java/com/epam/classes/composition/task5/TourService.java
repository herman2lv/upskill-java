package com.epam.classes.composition.task5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TourService {

    public void sortByPrice(List<Tour> tours) {
        tours.sort(new Tour.PriceComparator());
    }

    public void sortByDuration(List<Tour> tours) {
        tours.sort(new Tour.DurationComparator());
    }

    public List<Tour> getToursByType(List<Tour> tours, TourType type) {
        List<Tour> selectedTours = new ArrayList<>();
        for (Tour tour: tours) {
            if (tour.getType() == type) {
                selectedTours.add(tour);
            }
        }
        return selectedTours;
    }

    public List<Tour> getToursByDuration(List<Tour> tours, int minDuration, int maxDuration) {
        List<Tour> selectedTours = new ArrayList<>();
        for (Tour tour: tours) {
            if (tour.getDuration() >= minDuration && tour.getDuration() <= maxDuration) {
                selectedTours.add(tour);
            }
        }
        return selectedTours;
    }

    public List<Tour> getToursByPrice(List<Tour> tours, int maxPrice) {
        List<Tour> selectedTours = new ArrayList<>();
        for (Tour tour: tours) {
            if (tour.getPrice().compareTo(BigDecimal.valueOf(maxPrice)) <= 0) {
                selectedTours.add(tour);
            }
        }
        return selectedTours;
    }

    public List<Tour> getToursByTransport(List<Tour> tours, Transport transport) {
        List<Tour> selectedTours = new ArrayList<>();
        for (Tour tour: tours) {
            if (tour.getTransport() == transport) {
                selectedTours.add(tour);
            }
        }
        return selectedTours;
    }

    public List<Tour> getToursByCountry(List<Tour> tours, Country country) {
        List<Tour> selectedTours = new ArrayList<>();
        for (Tour tour: tours) {
            if (tour.getCountry() == country) {
                selectedTours.add(tour);
            }
        }
        return selectedTours;
    }

    public List<Tour> getToursByMeals(List<Tour> tours, Meals meals) {
        List<Tour> selectedTours = new ArrayList<>();
        for (Tour tour: tours) {
            if (tour.getMeals() == meals) {
                selectedTours.add(tour);
            }
        }
        return selectedTours;
    }

}
