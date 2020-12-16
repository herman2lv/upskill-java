package com.epam.classes.aggregationAndComposition.Task5;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TourDAO {
    private final List<Tour> tours;

    public TourDAO() {
        Tour tour1 = new Tour(TourType.CRUISE, "Caribbean Fairy-tale", Country.UNITED_STATES, 14,
                Transport.REGULAR_FLIGHT, Meals.ALL_INCLUSIVE, BigDecimal.valueOf(3990.90));
        Tour tour2 = new Tour(TourType.GUIDED_TOUR, "German Castles", Country.GERMANY, 5,
                Transport.COACH, Meals.CONTINENTAL_BREAKFAST, BigDecimal.valueOf(998.90));
        Tour tour3 = new Tour(TourType.GUIDED_TOUR, "Unknown Poland", Country.POLAND, 5,
                Transport.COACH, Meals.ENGLISH_BREAKFAST, BigDecimal.valueOf(399.99));
        Tour tour4 = new Tour(TourType.SHOPPING, "Oxford Street Boutiques", Country.UNITED_KINGDOM, 2,
                Transport.REGULAR_FLIGHT, Meals.NONE, BigDecimal.valueOf(599.90));
        Tour tour5 = new Tour(TourType.MEDICAL_TREATMENT, "Neuschwanschtenerger Clinic Tour", Country.GERMANY,
                30, Transport.CHARTER_FLIGHT, Meals.ALL_INCLUSIVE, BigDecimal.valueOf(21899.90));
        Tour tour6 = new Tour(TourType.MEDICAL_TREATMENT, "Gdanski Spital Marynarki Woiskowoj", Country.POLAND,
                30, Transport.CHARTER_FLIGHT, Meals.ALL_INCLUSIVE, BigDecimal.valueOf(8990.90));
        Tour tour7 = new Tour(TourType.RECREATION, "The Greats Lakes Tour", Country.UNITED_STATES, 10,
                Transport.REGULAR_FLIGHT, Meals.NONE, BigDecimal.valueOf(2689.90));
        Tour tour8 = new Tour(TourType.RECREATION, "Berlin Night Life", Country.GERMANY, 3,
                Transport.COACH, Meals.NONE, BigDecimal.valueOf(499.99));
        Tour tour9 = new Tour(TourType.RECREATION, "Octoberfest At Glance", Country.GERMANY, 5,
                Transport.TRAIN, Meals.CONTINENTAL_BREAKFAST, BigDecimal.valueOf(690.99));
        Tour tour10 = new Tour(TourType.SHOPPING, "Byalastokskie zakupy", Country.POLAND, 2,
                Transport.COACH, Meals.NONE, BigDecimal.valueOf(249.99));
        tours = Arrays.asList(tour1, tour2, tour3, tour4, tour5, tour6, tour7, tour8, tour9, tour10);
    }

    public List<Tour> getTours() {
        return tours;
    }
}
