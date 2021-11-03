package task_42v2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea_Five() {
        Shape shape = new Circle(5);
        Assertions.assertEquals(78.53981633974483,shape.getArea());
    }

    @Test
    void getPerimeter() {
        Shape shape = new Circle(7);
        Assertions.assertEquals(43.982297150257104,shape.getPerimeter());
    }
}