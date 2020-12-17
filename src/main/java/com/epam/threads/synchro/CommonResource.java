package com.epam.threads.synchro;

public class CommonResource {
    StringBuilder builder = new StringBuilder();

    public /*synchronized*/ void write(String string, int i) {
        builder.append(string);
        builder.append(" -> ");
        builder.append(i);
        builder.append('\n');
    }
}
