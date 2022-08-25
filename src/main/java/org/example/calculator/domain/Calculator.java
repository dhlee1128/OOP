package org.example.calculator.domain;

import java.util.List;

import org.example.calculator.operator.AdditionOperator;
import org.example.calculator.operator.DivisionOperator;
import org.example.calculator.operator.MultiplicationOperator;
import org.example.calculator.operator.NewArithmeticOperator;
import org.example.calculator.operator.SubtractionOperator;

public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2 ) {
        return arithmeticOperators.stream()
            .filter(arithmeticOperators -> arithmeticOperators.supports(operator))
            .map(arithmeticOperators -> arithmeticOperators.calculate(operand1, operand2))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
