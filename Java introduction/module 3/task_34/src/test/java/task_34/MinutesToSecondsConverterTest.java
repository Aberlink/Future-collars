package task_34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsConverterTest {

    MinutesToSecondsConverter minutesToSecondsConverter = new MinutesToSecondsConverter();

    @Test
    void shouldSecondsCheck_Four() {
        //given
        double minutes = 4d;
        //then
        Assertions.assertEquals(240,minutesToSecondsConverter.minutesToSeconds(minutes));
    }
    @Test
    void shouldSecondsCheck_Half() {
        //given
        double minutes = 0.5d;
        //then
        Assertions.assertEquals(30,minutesToSecondsConverter.minutesToSeconds(minutes));
    }
}