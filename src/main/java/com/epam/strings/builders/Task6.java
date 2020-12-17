package com.epam.strings.builders;

public class Task6 {
    public static void main(String[] args) {
        String string = "The man who executes criminal orders is also a criminal!";
        System.out.printf("The initial string is:%n\"%s\"%n", string);
        string = string.replaceAll(".", "$0$0");
        System.out.printf("The modified string is:%n\"%s\"%n", string);
    }
}