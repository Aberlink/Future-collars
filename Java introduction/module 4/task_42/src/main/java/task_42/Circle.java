package task_42;

public class Circle extends Shapes{


    public Circle(double firstArg) {
        super(firstArg);

    }

    @Override
    public double getArea() {
        return (firstDim * firstDim / 4) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return firstDim * Math.PI;
    }
}
