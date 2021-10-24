package first.project.task_23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void shouldSum_SixAndTwo() {

        //given
        double value1 = 6;
        double value2 = 2;

        //when
        double sum = calculator.sum(value1, value2);

        //then
        Assertions.assertEquals(8, sum);
    }
    @Test
    void shouldSubtract_SixAndTwo() {

        //given
        double value1 = 6;
        double value2 = 2;

        //when
        double subtract = calculator.subtract(value1, value2);

        //then
        Assertions.assertEquals(4, subtract);
    }
    @Test
    void shouldMultiply_SixAndTwo() {

        //given
        double value1 = 6;
        double value2 = 2;

        //when
        double multiply = calculator.multiply(value1, value2);

        //then
        Assertions.assertEquals(12, multiply);
    }
    @Test
    void shouldDivide_SixAndTwo() {

        //given
        double value1 = 6;
        double value2 = 2;

        //when
        double divide = calculator.divide(value1, value2);

        //then
        Assertions.assertEquals(3, divide);
    }
    @Test
    void shouldDivide_SixAndZero() {

        //given
        double value1 = 6;
        double value2 = 0;

        Assertions.assertThrows(RuntimeException.class, () -> {
            //when
            calculator.divide(value1, value2);
        });
    }


}