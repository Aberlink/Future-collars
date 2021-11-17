package task_52;

import java.util.Arrays;

public class FizzBuzz {

    public static void main(String[] args) {
    game();
    }

    static void game(){
        int[] values = new int[100];
        for (int i = 0; i < values.length; i++){
            values[i] = i + 1;
            if (values[i] % 3 == 0 && values[i] % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (values[i] % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (values[i] % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                    System.out.println(values[i]);
                }
            }
        }
    }

