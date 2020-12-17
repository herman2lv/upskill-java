package com.epam.classes.composition.task5;

import java.math.BigDecimal;
import java.util.Comparator;

public class Tour {
    private static final long INITIAL_ID_COUNTER = 1;
    private static long idCounter = INITIAL_ID_COUNTER;
    private final long tourId;
    private final TourType type;
    private final String name;
    private final Country country;
    private final int duration;
    private final Transport transport;
    private final Meals meals;
    private BigDecimal price;

    public Tour(TourType type, String name, Country country, int duration,
                Transport transport, Meals meals, BigDecimal price) {
        tourId = idCounter++;
        this.type = type;
        this.name = name;
        this.country = country;
        this.duration = duration;
        this.transport = transport;
        this.meals = meals;
        this.price = price;
    }

    public TourType getType() {
        return type;
    }

    public Country getCountry() {
        return country;
    }

    public int getDuration() {
        return duration;
    }

    public Transport getTransport() {
        return transport;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Meals getMeals() {
        return meals;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nTour{"
                + "tourId=" + tourId
                + ", type=" + type
                + ", name='" + name + '\''
                + ", country=" + country
                + ", duration=" + duration
                + ", transport=" + transport
                + ", meals=" + meals
                + ", price=" + price
                + '}';
    }

    public static class PriceComparator implements Comparator<Tour> {
        @Override
        public int compare(Tour o1, Tour o2) {
            return o1.getPrice().subtract(o2.getPrice()).intValue();
        }
    }

    public static class DurationComparator implements Comparator<Tour> {
        @Override
        public int compare(Tour o1, Tour o2) {
            return o1.getDuration() - o2.getDuration();
        }
    }
}
