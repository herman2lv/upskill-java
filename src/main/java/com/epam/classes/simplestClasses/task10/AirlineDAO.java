package com.epam.classes.simplestClasses.task10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class AirlineDAO {
    private final List<Airline> airlines;

    public AirlineDAO() {
        Set<Weekday> weekdays = Set.of(Weekday.MONDAY, Weekday.WEDNESDAY, Weekday.SUNDAY);
        Airline airline1 = new Airline("London", "132F", PlaneType.EMBRAER_JET, "11.20", weekdays);
        weekdays = Set.of(Weekday.MONDAY, Weekday.TUESDAY, Weekday.SUNDAY);
        Airline airline2 = new Airline("Warsaw", "217SW", PlaneType.EMBRAER_JET, "12.45", weekdays);
        weekdays = Set.of(Weekday.MONDAY, Weekday.TUESDAY, Weekday.THURSDAY, Weekday.SATURDAY);
        Airline airline3 = new Airline("Moscow", "322ARF", PlaneType.BOEING_747, "18.00", weekdays);
        weekdays = Set.of(Weekday.MONDAY, Weekday.FRIDAY);
        Airline airline4 = new Airline("New-York", "100U", PlaneType.BOEING_747, "16.14", weekdays);
        weekdays = Collections.singleton(Weekday.THURSDAY);
        Airline airline5 = new Airline("London", "217D", PlaneType.CESNA_172, "22.08", weekdays);
        this.airlines = Arrays.asList(airline1, airline2, airline3, airline4, airline5);
    }

    public List<Airline> getAirlines() {
        return airlines;
    }
}
