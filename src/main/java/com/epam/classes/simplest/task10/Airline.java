package com.epam.classes.simplest.task10;

import java.util.Collections;
import java.util.Set;

public class Airline {
    private String destination;
    private String flight;
    private PlaneType planeType;
    private String timeOfDeparture;
    private Set<Weekday> weekdays;

    public Airline(String destination, String flight, PlaneType planeType,
                   String timeOfDeparture, Set<Weekday> weekdays) {
        this.destination = destination;
        this.flight = flight;
        this.planeType = planeType;
        this.timeOfDeparture = timeOfDeparture;
        this.weekdays = weekdays;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public Set<Weekday> getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(Set<Weekday> weekdays) {
        this.weekdays = weekdays;
    }

    public void setWeekdays(Weekday... weekdays) {
        Collections.addAll(this.weekdays, weekdays);
    }

    @Override
    public String toString() {
        return "\nAirline{"
                + "destination='" + destination + '\''
                + ", flight='" + flight + '\''
                + ", planeType=" + planeType
                + ", timeOfDeparture='" + timeOfDeparture + '\''
                + ", weekdays=" + weekdays
                + '}';
    }
}
