package task_42v2;

public class Rectangle extends Shape{

    protected double firstSide;
    protected double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle() {
    }

    @Override
    protected double getArea() {
        return firstSide * secondSide;
    }

    @Override
    protected double getPerimeter() {
        return 2 * (firstSide + secondSide);
    }
}
