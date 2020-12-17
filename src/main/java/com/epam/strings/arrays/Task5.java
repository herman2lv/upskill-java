package com.epam.strings.arrays;

public class Task5 {
    public static void main(String[] args) {
        String string = "  Criminals   should            be in     prison   not    in   palace      ";
        System.out.printf("The initial string is:%n\"%s\"%n", string);
        string = string.strip().replaceAll("\s+", " ");
        System.out.printf("The modified string is:%n\"%s\"%n", string);
    }
}