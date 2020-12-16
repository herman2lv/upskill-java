package com.epam.classes.simplestClasses.task3;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public List<Student> getExcellentStudents(List<Student> group) {
        List<Student> excellentStudents = new ArrayList<>();
        for (Student student: group) {
            boolean isExcellent = true;
            for (int mark: student.getMarks()) {
                if (mark < 9) {
                    isExcellent = false;
                    break;
                }
            }
            if (isExcellent) {
                excellentStudents.add(student);
            }
        }
        return excellentStudents;
    }
}
