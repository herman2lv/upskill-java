package com.epam.threads.synchro;

public class CommonResource {
    private final StringBuilder builder = new StringBuilder();

    public StringBuilder getBuilder() {
        return builder;
    }

    public /*synchronized*/ void write(String string, int i) {
        builder.append(string);
        builder.append(" -> ");
        builder.append(i);
        builder.append('\n');
    }
}
