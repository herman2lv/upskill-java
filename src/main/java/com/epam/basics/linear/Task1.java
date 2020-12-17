package com.epam.basics.linear;

import com.epam.basics.cycles.NumberService;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task1 {
    public static void main(String[] args) {
        String function = "z = ((a - 3) * b /2) + c";
        System.out.printf("Function: %s", function);
        System.out.print("\nPlease, enter a value of variable 'a'");
        NumberService numberService = new NumberService();
        BigDecimal a = numberService.getBigDecimalFomConsole();
        System.out.print("Please, enter a value of variable 'b'");
        BigDecimal b = numberService.getBigDecimalFomConsole();
        System.out.print("Please, enter a value of variable 'c'");
        BigDecimal c = numberService.getBigDecimalFomConsole();
        BigDecimal z = (b.multiply(a.subtract(BigDecimal.valueOf(3))));
        z = (z.divide(BigDecimal.valueOf(2), 10, RoundingMode.HALF_UP)).add(c);
        System.out.printf("%nif\t\ta = %f\tb = %f\tc = %f", a, b, c);
        System.out.printf("%nthen\tz = %f", z);

    }
}

