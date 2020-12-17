package com.epam.basics.cycles;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        BigInteger product = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            product = product.multiply((BigInteger.valueOf(i)).pow(2));
        }
        System.out.printf("Product of squares of all natural numbers from 1 to 200 is %s", product);
    }
}
