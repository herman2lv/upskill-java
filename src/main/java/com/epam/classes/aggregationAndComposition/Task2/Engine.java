package com.epam.classes.aggregationAndComposition.Task2;

public class Engine {
    private String model;
    private boolean isStarted;
    private boolean isOk;

    public void repair() {
        isOk = true;
    }

    public void start() {
        if (isOk) {
            isStarted = true;
        }
    }

    public void off() {
        isStarted = false;
    }

    public String getModel() {
        return model;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
