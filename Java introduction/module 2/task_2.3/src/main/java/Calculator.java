public class Calculator {

    public static void main(String[] args) {

    }

    public void sum(double firstArg, double secondArg) {
        double result = firstArg + secondArg;
        System.out.println(result);
    }

    public void substract(double firstArg, double secondArg) {
        double result = firstArg - secondArg;
        System.out.println(result);
    }

    public void multiply(double firstArg, double secondArg) {
        double result = firstArg * secondArg;
        System.out.println(result);
    }

    public void divide(double firstArg, double secondArg) {
        if (secondArg == 0) {
        throw new RuntimeException();
        }
        else
        {
            double result = firstArg / secondArg;
            System.out.println(result);
        }
    }



}
