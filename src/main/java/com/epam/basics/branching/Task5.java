package com.epam.basics.branching;

import com.epam.basics.cycles.NumberService;

import java.math.BigDecimal;

public class Task5 {
    public static void main (String[] args) {
        String function = """
                        x² - 3x + 9, if x ≤ 3;
                F(x)={ 
                        1 / (x³ + 6), if x > 3.
                """;
        System.out.printf("Function: \n%s", function);
        NumberService numberService = new NumberService();
        System.out.print("Please, enter a value of variable 'x'");
        BigDecimal x = numberService.getBigDecimalFomConsole();
        BigDecimal result;
        if (x.compareTo(BigDecimal.valueOf(3)) > 0) {
            BigDecimal temp = (x.pow(3)).add(BigDecimal.valueOf(6));
            result = BigDecimal.valueOf(Math.pow(temp.doubleValue(), -1));
        } else {
            BigDecimal temp = (x.pow(2)).subtract(x.multiply(BigDecimal.valueOf(3)));
            result = temp.add(BigDecimal.valueOf(9));
        }
        System.out.printf("\nif x = %.2f", x);
        System.out.printf("\nthen result is %f", result);
    }
}
