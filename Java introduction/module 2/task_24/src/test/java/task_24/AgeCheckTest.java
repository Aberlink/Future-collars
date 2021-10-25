package task_24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeCheckTest {

    AgeCheck ageCheck = new AgeCheck();

    @Test
    void ShoudAgeCheck_AgeEight () {
        //given
        int age = 8;
        //then
        Assertions.assertFalse(AgeCheck.ageCheck(age));
    }
    @Test
    void ShoudAgeCheck_AgeTwentyFive () {
        //given
        int age = 25;
        //then
        Assertions.assertTrue(AgeCheck.ageCheck(age));
    }
    @Test
    void ShoudAgeCheck_AgeEighteen () {
        //given
        int age = 18;
        //then
        Assertions.assertTrue(AgeCheck.ageCheck(age));
    }
    @Test
    void ShoudAgeCheck_AgeMinusFive () {
        //given
        int age = -5;
        //then
        Assertions.assertThrows(RuntimeException.class, () -> {
            AgeCheck.ageCheck(age);
        });
    }
}