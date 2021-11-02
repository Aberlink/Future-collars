package task_43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area_two() {
        Circle circle = new Circle(2);
        Assertions.assertEquals(12.566370614359172, circle.area());
    }

    @Test
    void perimeter_four() {
        Circle circle = new Circle(4);
        Assertions.assertEquals(25.132741228718345, circle.perimeter());
    }
}