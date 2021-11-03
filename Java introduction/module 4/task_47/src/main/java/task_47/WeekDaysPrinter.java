package task_47;

import java.util.Locale;

public class WeekDaysPrinter {

    public static void main(String[] args) {
        dayPrinter();
    }

    public static String dayPrinter() {
        for (WeekDaysOperator weekDaysOperator: WeekDaysOperator.values()) {
            System.out.println(weekDaysOperator.toString());
            return weekDaysOperator.toString();}
        }
    }

}
