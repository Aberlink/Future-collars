package first.project.task_23;

public class Calculator {

    public static void main(String[] args) {

    }

    public double sum(double firstArg, double secondArg) {
        double result = firstArg + secondArg;
        System.out.println(result);
        return result;
    }

    public double subtract(double firstArg, double secondArg) {
        double result = firstArg - secondArg;
        System.out.println(result);
        return result;
    }

    public double multiply(double firstArg, double secondArg) {
        double result = firstArg * secondArg;
        System.out.println(result);
        return result;
    }

    public double divide(double firstArg, double secondArg) {
        if (secondArg == 0) {
        throw new RuntimeException();
        }
        else
        {
            double result = firstArg / secondArg;
            System.out.println(result);
            return result;
        }
    }



}
