package com.epam.oop.calendar;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate dayToCheck = LocalDate.of(2021, Month.JANUARY, 5);
        MyCalendar myCalendar = new MyCalendar();
        if (myCalendar.checkWorkDay(dayToCheck)) {
            System.out.println("Workday");
        } else {
            System.out.println("Day off");
        }
    }
}
