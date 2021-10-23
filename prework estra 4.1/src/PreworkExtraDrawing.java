import java.util.Arrays;

public class PreworkExtraDrawing {

    public static void runProgram(String[] args) {

    }

    public static void drawing (int hight, int width) {

        char[][] array = new char[hight][width];

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == array.length - 1){
                for (int j = 0; j < array[i].length; j++){
                    array[i][j] = '*';
                }
            }
            else {
                for (int k = 0; k < array[i].length; k++) {
                    array[i][k] = ' ';
                    array[i][0] = '*';
                    array[i][array[i].length - 1] = '*';
                }
            }

        }

        System.out.println(Arrays.deepToString(array)
                .replace("],","\n").replace(","," ")
                .replaceAll("[\\[\\]]", " "));


    }
}