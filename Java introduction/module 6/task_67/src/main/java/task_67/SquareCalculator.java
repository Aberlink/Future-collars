package task_67;

public class SquareCalculator {

    public static void main(String[] args) {
        System.out.println(getSquare(-5));
    }

    static double getSquare(double inputNumber) throws ExtendedExceptions {
        if (inputNumber >= 0) {
            return Math.sqrt(inputNumber);
        }
        else {
            throw new ExtendedExceptions("IllegalArgumentException");
        }
    }
}
