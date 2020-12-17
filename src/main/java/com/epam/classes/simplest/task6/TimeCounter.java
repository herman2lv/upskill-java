package com.epam.classes.simplest.task6;

import java.text.DecimalFormat;

public class TimeCounter {
    static final int NUMBER_OF_SECONDS_IN_MINUTE = 60;
    static final int NUMBER_OF_MINUTES_IN_HOUR = 60;
    static final int DEFAULT_VALUE = 0;
    private int hours;
    private int minutes;
    private int seconds;

    public TimeCounter() {
    }

    public TimeCounter(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        validateForNegative();
        normalizeTime();
    }

    private void validateForNegative() {
        if (hours < 0) {
            hours = DEFAULT_VALUE;
        }
        if (minutes < 0) {
            minutes = DEFAULT_VALUE;
        }
        if (seconds < 0) {
            seconds = DEFAULT_VALUE;
        }
    }

    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        validateForNegativeAndMax();
    }

    private void validateForNegativeAndMax() {
        if (hours < 0) {
            hours = DEFAULT_VALUE;
        }
        if (minutes < 0 || minutes >= NUMBER_OF_MINUTES_IN_HOUR) {
            minutes = DEFAULT_VALUE;
        }
        if (seconds < 0 || seconds >= NUMBER_OF_SECONDS_IN_MINUTE) {
            seconds = DEFAULT_VALUE;
        }
    }

    public void addTime(int hours, int minutes, int seconds) {
        int numberOfSeconds = getNumberOfSeconds() + getNumberOfSeconds(hours, minutes, seconds);
        this.hours = 0;
        this.minutes = 0;
        if (numberOfSeconds < 0) {
            this.seconds = 0;
            return;
        }
        this.seconds = numberOfSeconds;
        normalizeTime();
    }

    public void setHours(int hours) {
        this.hours = hours;
        validateForNegativeAndMax();
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        validateForNegativeAndMax();
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        validateForNegativeAndMax();
    }

    public void printTime() {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        String formattedMinutes = decimalFormat.format(minutes);
        String formattedSeconds = decimalFormat.format(seconds);
        String formattedHours = decimalFormat.format(hours);
        System.out.printf("%sh %smin %ss%n", formattedHours, formattedMinutes, formattedSeconds);
    }

    private void normalizeTime() {
        if (this.seconds >= NUMBER_OF_SECONDS_IN_MINUTE) {
            this.minutes += this.seconds/NUMBER_OF_SECONDS_IN_MINUTE;
            this.seconds = this.seconds % NUMBER_OF_SECONDS_IN_MINUTE;
        }
        if (this.minutes >= NUMBER_OF_MINUTES_IN_HOUR) {
            this.hours += this.minutes/NUMBER_OF_MINUTES_IN_HOUR;
            this.minutes = this.minutes % NUMBER_OF_MINUTES_IN_HOUR;
        }
    }

    private int getNumberOfSeconds() {
        return getNumberOfSeconds(hours, minutes, seconds);
    }

    private int getNumberOfSeconds(int hours, int minutes, int seconds) {
        return (hours * NUMBER_OF_MINUTES_IN_HOUR + minutes) * NUMBER_OF_SECONDS_IN_MINUTE + seconds;

    }
}
