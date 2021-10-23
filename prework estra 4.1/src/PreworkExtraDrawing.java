public class PreworkExtraDrawing {

    public static void runProgram(String[] args) {
        drawing(3,5);
    }

    public static void drawing (int hight, int width) {

        char[][] array = new char[hight][width];

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == array.length){
                for (int j = 0; j < array[i].length; j++){
                    array[i][j] = '*';
                }
            }

        }

    }

}

