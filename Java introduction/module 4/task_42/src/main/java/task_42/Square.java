package task_42;

public class Square extends Rectangle{


    public Square(double firstArg) {
        super(firstArg);
    }

    @Override
    public double getArea() {
        return firstDim * firstDim;
    }

    @Override
    public double getPerimeter() {
        return 4 * firstDim;
    }
}
