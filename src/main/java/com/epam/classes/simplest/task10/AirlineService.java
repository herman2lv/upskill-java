package com.epam.classes.simplest.task10;

import java.util.ArrayList;
import java.util.List;

public class AirlineService {
    private final AirlineDAO airlineDAO;

    public AirlineService(AirlineDAO airlineDAO) {
        this.airlineDAO = airlineDAO;
    }

    public void print() {
        System.out.println(airlineDAO.getAirlines());
    }

    public List<Airline> getAirlinesByDestination(String destination) {
        List<Airline> selectedAirlines = new ArrayList<>();
        for (Airline airline: airlineDAO.getAirlines()) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                selectedAirlines.add(airline);
            }
        }
        return selectedAirlines;
    }

    public List<Airline> getAirlinesByWeekday(Weekday weekday) {
        List<Airline> selectedAirlines = new ArrayList<>();
        for (Airline airline: airlineDAO.getAirlines()) {
            if (airline.getWeekdays().contains(weekday)) {
                selectedAirlines.add(airline);
            }
        }
        return selectedAirlines;
    }

    public List<Airline> getAirlinesByWeekdayAfterTime(Weekday weekday, String time) {
        List<Airline> selectedAirlines = getAirlinesByWeekday(weekday);
        selectedAirlines = getAirlinesAfterTime(selectedAirlines, time);
        return selectedAirlines;
    }

    private List<Airline> getAirlinesAfterTime(List<Airline> airlines, String time) {
        ArrayList<Airline> selectedAirlines = new ArrayList<>();
        for (Airline airline: airlines) {
            if (airline.getTimeOfDeparture().compareTo(time) > 0) {
                selectedAirlines.add(airline);
            }
        }
        return selectedAirlines;
    }
}
