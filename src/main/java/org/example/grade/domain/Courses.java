package org.example.grade.domain;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multipleCreditAndGrade() {
        return courses.stream()
                .mapToDouble(Course::multipleCreditAndGrade)
                .sum();
    }

    public int calculateTotalCredit() {
        return courses.stream()
            .mapToInt(Course::getCredit)
            .sum();
    }

}
