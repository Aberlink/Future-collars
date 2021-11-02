package task_42;

public class Rectangle extends Shapes{

    public Rectangle(double firstArg, double secondArg) {
        super(firstArg, secondArg);
    }

    public Rectangle(double firstArg) {
        super(firstArg);
    }

    @Override
    public double getArea() {
        if (secondDim <= 0) {
            throw new RuntimeException();
        }
        else {
            return firstDim * secondDim;
        }
    }

    @Override
    public double getPerimeter() {
        if (secondDim <= 0) {
            throw new RuntimeException();
        } else {
            return 2 * (firstDim + secondDim);
        }
    }
}
