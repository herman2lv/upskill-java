package com.epam.classes.simplestClasses.task3;

public class Student {
    private String name;
    private int group;
    private final int[] marks = new int[5];

    public Student(String name, int group, int[] marks) {
        this.name = name;
        this.group = group;
        int length = validateNumberOfMarks(marks);
        System.arraycopy(marks, 0, this.marks, 0, length);
    }

    private int validateNumberOfMarks(int[] marks) {
        return Math.min(marks.length, 5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        int length = validateNumberOfMarks(marks);
        System.arraycopy(marks, 0, this.marks, 0, length);
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", \tgroup=" + group +
                '}';
    }
}
