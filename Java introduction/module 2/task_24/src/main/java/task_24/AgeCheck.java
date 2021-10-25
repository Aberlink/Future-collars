package task_24;

public class AgeCheck {

    public static void main(String[] args) {
    }
    public static boolean ageCheck (int age){

        if (age < 18 && age >= 0){
            return false;
        }
        else if (age >= 18){
            return true;
        }
        else {
            throw new RuntimeException();
        }

    }
}
