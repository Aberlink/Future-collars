package task_67;

public class SquareCalculator {

    static double getSquare(double inputNumber) throws ExtendedExceptions {
        if (inputNumber >= 0) {
            return Math.sqrt(inputNumber);
        }
        else {
            throw new ExtendedExceptions("IllegalArgumentException");
        }
    }
}
