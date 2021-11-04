package task_42v2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Shape shape = new Square(5);

    @Test
    void getArea_five() {
        Assertions.assertEquals(25,shape.getArea());
    }
    @Test
    void getPerimeter_five() {
        Assertions.assertEquals(20,shape.getPerimeter());
    }
}