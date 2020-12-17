package com.epam.oop.flowers.ui;

public class EnumParser {

    public <T extends Enum<T>> T parseToEnum(Class<T> enumClass, String stringValue) throws IllegalArgumentException {
            return T.valueOf(enumClass, stringValue.toUpperCase());
    }
}
