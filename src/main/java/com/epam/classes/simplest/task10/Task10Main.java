package com.epam.classes.simplest.task10;

import java.util.List;

public class Task10Main {
    public static void main(String[] args) {
        AirlineDAO airlineDAO = new AirlineDAO();
        AirlineService airlineService = new AirlineService(airlineDAO);
        System.out.print("The list of all airlines: ");
        airlineService.print();
        String searchCriteria = "London";
        List<Airline> selectedAirlines = airlineService.getAirlinesByDestination(searchCriteria);
        System.out.printf("%nAirlines with given destination (%s): %s%n", searchCriteria, selectedAirlines);
        Weekday searchCriteriaWeekday = Weekday.MONDAY;
        selectedAirlines = airlineService.getAirlinesByWeekday(searchCriteriaWeekday);
        System.out.printf("%nAirlines of given weekday (%s): %s%n", searchCriteriaWeekday, selectedAirlines);
        searchCriteria = "14.00";
        selectedAirlines = airlineService.getAirlinesByWeekdayAfterTime(searchCriteriaWeekday, searchCriteria);
        System.out.printf("%nAirlines of given weekday (%s), after time of %s: %s%n",
                searchCriteriaWeekday, searchCriteria, selectedAirlines);
    }
}
