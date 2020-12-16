package com.epam.oop.calendarTask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

public class MyCalendar {
    private final List<Day> holidays = new ArrayList<>();

    public MyCalendar() {
        holidays.add(new Day(DayType.NATIONAL_HOLIDAY, "New Year", MonthDay.of(Month.JANUARY, 1)));
        holidays.add(new Day(DayType.NATIONAL_HOLIDAY, "Christmas", MonthDay.of(Month.JANUARY, 7)));
        holidays.add(new Day(DayType.NATIONAL_HOLIDAY, "Victory Day", MonthDay.of(Month.MAY, 9)));
        holidays.add(new Day(DayType.NATIONAL_HOLIDAY, "Independence Day", MonthDay.of(Month.JULY, 3)));
        holidays.add(new Day(DayType.NATIONAL_HOLIDAY, "Remembrance Day", MonthDay.of(Month.AUGUST, 9)));
    }

    public class Day {
        private final DayType dayType;
        private final String name;
        private final MonthDay date;

        public Day(DayType dayType, String name, MonthDay date) {
            this.dayType = dayType;
            this.name = name;
            this.date = date;
        }

        public DayType getDayType() {
            return dayType;
        }

        public String getName() {
            return name;
        }

        public MonthDay getDate() {
            return date;
        }

    }

    public boolean checkWorkDay(LocalDate date) {
        if (date.getDayOfWeek() == DayOfWeek.SATURDAY
                || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return false;
        }
        for (Day day : holidays) {
            if (day.getDate().getMonth() == date.getMonth()
                    && day.getDate().getDayOfMonth() == date.getDayOfMonth()) {
                return false;
            }
        }
        return true;
    }
}
