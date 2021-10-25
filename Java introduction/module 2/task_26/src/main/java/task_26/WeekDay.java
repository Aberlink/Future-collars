package task_26;

public class WeekDay {

    public static void main(String[] args) {

    }

    public static String weekDay (int number) {

        String daysNames[] = new String[7];

        daysNames[0] = "There is no such a day!";
        daysNames[1] = "Monday";
        daysNames[2] = "Tuesday";
        daysNames[3] = "Wednesday";
        daysNames[4] = "Thursday";
        daysNames[5] = "Friday";
        daysNames[6] = "Weekend";


        if (1 <=number && number <= 5) {
            return daysNames[number];
        }
        else if (number == 6 || number == 7) {
            return daysNames[6];
        }
        else {
            return daysNames[0];
        }
    }


}
