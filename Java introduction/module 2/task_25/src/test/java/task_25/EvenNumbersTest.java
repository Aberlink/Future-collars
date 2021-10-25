package task_25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumbersTest {

    EvenNumbers evenNumbers = new EvenNumbers();

    @Test
    void shouldIsEven_ten() {
        //given
        byte number = 10;
        //then
        Assertions.assertTrue(EvenNumbers.isEven(number));
    }
    @Test
    void shouldIsEven_eleven() {
        //given
        byte number = 11;
        //then
        Assertions.assertFalse(EvenNumbers.isEven(number));
    }
    @Test
    void shouldIsEven_minusEleven() {
        //given
        byte number = -11;
        //then
        Assertions.assertFalse(EvenNumbers.isEven(number));
    }
}