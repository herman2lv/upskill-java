package com.epam.basics.cycles;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Task2 {
    public static void main (String[] args) {
        String function = """
                    x, if x > 2;
                y={ 
                    -x, if x ≤ 2.
                                
                """;
        System.out.printf("Function: \n%s", function);
        System.out.print("Please, set up a left limit of the set of the x's values");
        NumberService numberService = new NumberService();
        BigDecimal leftLimit = numberService.getBigDecimalFomConsole();
        System.out.print("Please, set up a right limit of the set of the x's values");
        BigDecimal rightLimit;
        do {
            rightLimit = numberService.getBigDecimalFomConsole();
            if (rightLimit.compareTo(leftLimit) < 0) {
                System.out.println("Right limit couldn't be less than the left limit");
                System.out.printf("(left limit was set up as %.2f)\nPlease, try again", leftLimit);
            }
        } while (rightLimit.compareTo(leftLimit) < 0);
        System.out.print("Please, set up the step");
        BigDecimal step;
        do {
            step = numberService.getBigDecimalFomConsole();
            if (step.compareTo(rightLimit.subtract(leftLimit)) > 0) {
                System.out.printf("Step couldn't be greater than the set [%.2f;%.2f]\n", leftLimit, rightLimit);
                System.out.printf("(the largest possible value is %.2f)\nPlease, try again", rightLimit.subtract(leftLimit));
            } else if (step.compareTo(BigDecimal.valueOf(0.0)) <= 0) {
                System.out.print("Step couldn't be less than or equal to 0");
            }
        } while ((step.compareTo(rightLimit.subtract(leftLimit)) > 0) || (step.compareTo(BigDecimal.valueOf(0.0)) <= 0));
        int numberOfSteps = ((rightLimit.subtract(leftLimit)).divide(step, 10, RoundingMode.HALF_UP)).intValue() + 1;
        BigDecimal[] valuesOfY = new BigDecimal[numberOfSteps];
            int i = 0;
            for (BigDecimal x = leftLimit; x.compareTo(rightLimit) <= 0; x = x.add(step)) {
                if (x.compareTo(BigDecimal.valueOf(2.0)) > 0) {
                    valuesOfY[i] = x;
                } else {
                    valuesOfY[i] = x.negate();
                }
                i++;
            }
        System.out.printf("Set of y's values is:\n%s", Arrays.toString(valuesOfY));
    }
}
