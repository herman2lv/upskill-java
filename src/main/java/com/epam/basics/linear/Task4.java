package com.epam.basics.linear;

public class Task4 {
    public static void main (String[] args) {
        double initialNumber = 333.777;
        int integerPartOfNumber = (int) initialNumber;
        int decimalPartOfNumber = (int)(initialNumber*1000) % 1000;
        double resultNumber = decimalPartOfNumber + (double)integerPartOfNumber/1000;
        System.out.printf("Initial number is : %.3f", initialNumber);
        System.out.printf("%nResult number is : %.3f", resultNumber);
    }
}
