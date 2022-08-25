package org.example.calculator.operator;

import org.example.calculator.domain.PositiveNumber;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculate(final PositiveNumber  operand1, final PositiveNumber  operand2);
    
}
