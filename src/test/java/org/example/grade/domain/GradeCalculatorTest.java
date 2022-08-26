package org.example.grade.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * <요구사항>
 * 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
 * 일급 컬렉션 사용
 */

public class GradeCalculatorTest {
    // 학점 계산기 도메인 : 이수한 과목, 학점 계산기

    // 이수한 과목을 전달하여 평균 학점 계산을 요청 --> 학점 계산기에게 --> 평균학점 계산

    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }

}
