package com.epam.basics.linear;

import com.epam.basics.cycles.NumberService;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task2 {
    public static void main(String[] args) {
        String expression = """
                b + √(b² + 4ac)
                --------------- - a³c + b⁻²
                    2a
                """;
        System.out.printf("Function: \n%s", expression);
        NumberService numberService = new NumberService();
        System.out.print("Please, enter a value of variable 'a'");
        BigDecimal a = numberService.getBigDecimalFomConsole();
        System.out.print("Please, enter a value of variable 'b'");
        BigDecimal b = numberService.getBigDecimalFomConsole();
        System.out.print("Please, enter a value of variable 'c'");
        BigDecimal c = numberService.getBigDecimalFomConsole();
        BigDecimal temp = (a.multiply(c)).multiply(BigDecimal.valueOf(4));
        temp = temp.add(b.pow(2));
        try {
            temp = BigDecimal.valueOf(Math.sqrt(temp.doubleValue()));
        } catch (NumberFormatException e) {
            System.out.println("Expression (b² + 4ac) is negative, it's impossible to extract square root");
            System.exit(1);
        }
        BigDecimal temp1 = a.multiply(BigDecimal.valueOf(2));
        try {
            temp = (temp.add(b)).divide(temp1, 10, RoundingMode.HALF_UP);
        } catch (ArithmeticException e) {
            System.out.println("'a' = 0, it's impossible to divide by zero");
            System.exit(1);
        }
        temp1 = (a.pow(3)).multiply(c);
        temp = temp.subtract(temp1);
        try {
            temp1 = BigDecimal.valueOf(Math.pow(b.doubleValue(), -2));
        } catch (NumberFormatException e) {
            System.out.println("'b' = 0, it's impossible to take zero in negative power");
            System.exit(1);
        }
        BigDecimal result = temp.add(temp1);
        System.out.printf("\nif\t\ta = %f\tb = %f\tc = %f", a, b, c);
        System.out.printf("\nthen the result of expression is %f", result);
    }
}
