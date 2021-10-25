package task_26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayTest {
    
    WeekDay weekDay = new WeekDay();
    
    @Test
    void shouldWeekDay_beFriday() {
        int number = 5;

    Assertions.assertEquals("Friday", WeekDay.weekDay(number));
    }
    @Test
    void shouldWeekDay_beMonday() {
        int number = 1;

        Assertions.assertEquals("Monday", WeekDay.weekDay(number));
    }
    @Test
    void shouldWeekDay_beWeekend() {
        int number = 7;

        Assertions.assertEquals("Weekend", WeekDay.weekDay(number));
    }
    @Test
    void shouldWeekDay_beWarning() {
        int number = 8;

        Assertions.assertEquals("There is no such a day!", WeekDay.weekDay(number));
    }

}