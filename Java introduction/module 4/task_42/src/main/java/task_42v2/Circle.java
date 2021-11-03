package task_42v2;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    protected double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
