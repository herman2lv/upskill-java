package com.epam.basics.linear;

import com.epam.basics.cycles.NumberService;

public class Task3 {
    public static void main (String[] args) {
        String expression = """
                sin x + cos y
                -------------- * tg xy
                cos x - sin y
                """;
        System.out.printf("Function: \n%s", expression);
        NumberService numberService = new NumberService();
        System.out.print("Please, enter a value of variable 'x' (in degrees)");
        double x = (numberService.getBigDecimalFomConsole()).doubleValue();
        System.out.print("Please, enter a value of variable 'y' (in degrees)");
        double y = (numberService.getBigDecimalFomConsole()).doubleValue();
        double radiansX = Math.toRadians(x);
        double radiansY = Math.toRadians(y);
        double temp = Math.sin(radiansX) + Math.cos(radiansY);
        temp /= Math.cos(radiansX) - Math.sin(radiansY);
        double result = temp * Math.tan(radiansX * radiansY);
        System.out.printf("\nif\t\tx = %f°\ty = %f°", x, y);
        System.out.printf("\nthen the result of expression is %f", result);
    }
}
