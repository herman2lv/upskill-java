package com.epam.fundamentals;

import java.util.Arrays;

public class MainTask2 {
    public static void main (String [] args) {
        //Task is to display in console command line arguments in reversed order
        if (args.length == 0) {
            System.out.println("There is no any command line arguments");
            System.exit(1);
        }
        String[] reversedArgs = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            reversedArgs[args.length - 1 - i] = args[i];
        }
        System.out.println("Initial arguments : " + Arrays.toString(args));
        System.out.println("Reversed arguments : " + Arrays.toString(reversedArgs));
    }
}
