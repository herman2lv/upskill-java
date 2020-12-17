package com.epam.basics.linear;

import com.epam.basics.cycles.NumberService;

public class Task6 {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        System.out.print("Please, enter a value of variable 'x'");
        double x = (numberService.getBigDecimalFomConsole()).doubleValue();
        System.out.print("Please, enter a value of variable 'y'");
        double y = (numberService.getBigDecimalFomConsole()).doubleValue();
        boolean isIncluded = (((y >= 0 && y <= 4 && Math.abs(x) <= 2) || (y <= 0 && y >= -3 && Math.abs(x) <= 4))
                && (x != 0 || y != -1));
        System.out.println(isIncluded);
    }
}
