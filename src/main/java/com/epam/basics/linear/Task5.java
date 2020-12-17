package com.epam.basics.linear;

import java.text.DecimalFormat;

public class Task5 {
    public static void main(String[] args) {
        int fullTime = 35409;
        int seconds = (fullTime % 60);
        int minutes = ((fullTime / 60) % 60);
        int hours = (fullTime / (60 * 60));
        DecimalFormat decimalFormat = new DecimalFormat("00");
        String formattedMinutes = decimalFormat.format(minutes);
        String formattedSeconds = decimalFormat.format(seconds);
        String formattedHours = decimalFormat.format(hours);
        System.out.printf("The number of passed seconds is %ds", fullTime);
        System.out.printf("%nIt is equal to %sh %smin %ss", formattedHours, formattedMinutes, formattedSeconds);
    }
}
