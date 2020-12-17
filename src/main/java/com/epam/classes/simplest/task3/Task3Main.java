package com.epam.classes.simplest.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3Main {
    public static void main(String[] args) {
        Student student1 = new Student("Lushcenko A.R.", 1, new int[]{9, 8, 4, 2, 2});
        Student student2 = new Student("Hrenin V.H.", 1, new int[]{4, 3, 3, 3, 3});
        Student student3 = new Student("Tsertsel I.N.", 1, new int[]{9, 9, 10, 10, 9});
        Student student4 = new Student("Raukou A.A.", 1, new int[]{3, 8, 3, 2, 2});
        Student student5 = new Student("Valfovich A.R.", 1, new int[]{7, 7, 8, 8, 7});
        Student student6 = new Student("Vakulchyk V.P.", 1, new int[]{9, 10, 9, 9, 10});
        Student student7 = new Student("Karaeu U.H.", 1, new int[]{9, 8, 8, 7, 7});
        Student student8 = new Student("Naumenko A.O.", 1, new int[]{5, 7, 7, 8, 9});
        Student student9 = new Student("Kosygin R.A.", 1, new int[]{9, 3, 2, 6, 5});
        Student student10 = new Student("Kachanava A.L.", 1, new int[]{10, 9, 10, 9, 9});

        List<Student> group = new ArrayList<>();
        group.add(student1);
        group.add(student2);
        group.add(student3);
        group.add(student4);
        group.add(student5);
        group.add(student6);
        group.add(student7);
        group.add(student8);
        group.add(student9);
        group.add(student10);

        System.out.printf("The list of students is: %s%n", group);
        StudentService service = new StudentService();
        List<Student> excellentStudents = service.getExcellentStudents(group);
        System.out.printf("%nThe list of students which have only excellent marks: %s%n", excellentStudents);
    }
}
