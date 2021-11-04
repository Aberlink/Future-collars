package task_42v2;

public class Triangle extends Shape{

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    protected double getArea() {
        return (firstSide + secondSide + thirdSide) / 2;
    }

    @Override
    protected double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }
}
