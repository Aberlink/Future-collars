package task_35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PythagorasTest {

    Pythagoras pythagoras = new Pythagoras();

    @Test
    void shouldPythagoras_ThreeFiveFour() {

        //given
        double firstArg = 3;
        double secondArg = 5;
        double thirdtArg = 4;
        //when
        boolean check = Pythagoras.pythagorasCheck(firstArg,secondArg,thirdtArg);
        //then
        Assertions.assertTrue(check);
    }
    @Test
    void shouldPythagoras_ThreeFourSix() {

        //given
        double firstArg = 3;
        double secondArg = 4;
        double thirdtArg = 6;
        //when
        boolean check = Pythagoras.pythagorasCheck(firstArg,secondArg,thirdtArg);
        //then
        Assertions.assertFalse(check);
    }
    @Test
    void shouldPythagoras_ThreeFourNine() {

        //given
        double firstArg = 3;
        double secondArg = 4;
        double thirdtArg = 9;

        //then
     Assertions.assertThrows(RuntimeException.class, () -> {
         //when
         Pythagoras.pythagorasCheck(firstArg, secondArg, thirdtArg);
     });
    }
    @Test
    void shouldPythagoras_ThreeFourMinusFive() {

        //given
        double firstArg = 3;
        double secondArg = 4;
        double thirdtArg = -5;

        //then
        Assertions.assertThrows(RuntimeException.class, () -> {
            //when
            Pythagoras.pythagorasCheck(firstArg, secondArg, thirdtArg);
        });
    }


}