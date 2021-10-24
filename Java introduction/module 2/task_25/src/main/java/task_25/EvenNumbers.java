package task_25;

public class EvenNumbers {

    public static void main(String[] args) {
    }
    public static boolean isEven (int number) {

            int even = (number % 2);
            if (even == 1 || even == -1){
                return false;
            }
            else {
                return true;
            }
        }


}
