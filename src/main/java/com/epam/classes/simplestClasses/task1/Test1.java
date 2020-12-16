package com.epam.classes.simplestClasses.task1;

public class Test1 {
    private int variable1;
    private int variable2;

    public int getVariable1() {
        return variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public void setVariable2(int variable2) {
        this.variable2 = variable2;
    }

    public void  printVariables() {
        System.out.printf("Variable 1 is \"%d\"\n", variable1);
        System.out.printf("Variable 2 is \"%d\"\n", variable2);
    }

    public int getSum() {
        return variable1 + variable2;
    }

    public int getMax() {
        return Math.max(variable1, variable2);
    }
}
