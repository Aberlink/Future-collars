package task_42;

public class Triangle extends Shapes{

    public Triangle(double firstArg, double secondArg, double thirdArg) {
        super(firstArg, secondArg, thirdArg);
    }

    @Override
    public double getArea() {
        return firstDim * secondDim * thirdDim / 2;
    }

    @Override
    public double getPerimeter() {
        return firstDim + secondDim + thirdDim;
    }
}
