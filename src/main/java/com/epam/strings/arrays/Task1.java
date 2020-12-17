package com.epam.strings.arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] names = {"firstName", "secondName", "thirdNameAndOneMoreWord", "anotherName", "nameWithAcronymABC"};
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].replaceAll("([A-Z])", "_$1").toLowerCase();
            }
        for (String element: names) {
            System.out.println(element);
        }
    }
}