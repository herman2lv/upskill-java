package com.epam.oop.flowersShop.userInterface;

public class EnumParser {

    public <T extends Enum<T>> T parseToEnum(Class<T> enumClass, String stringValue) throws IllegalArgumentException {
            return T.valueOf(enumClass, stringValue.toUpperCase());
    }
}
