package task_43;

public class Rectangle implements AreaAndPerimeter{

    double firstFrame;
    double secondFrame;

    public Rectangle(double firstFrame, double secondFrame) {
        this.firstFrame = firstFrame;
        this.secondFrame = secondFrame;
    }

    @Override
    public double area() {
        return firstFrame * secondFrame;
    }

    @Override
    public double perimeter() {
        return 2 * (firstFrame + secondFrame);
    }
}
