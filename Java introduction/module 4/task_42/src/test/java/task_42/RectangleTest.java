package task_42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {


    @Test
    void getArea_fiveSix() {
        Shapes rectangle = new Rectangle(5,6);
        Assertions.assertEquals(30,rectangle.getArea());
    }

    @Test
    void getPerimeter_fiveSix() {
        Shapes rectangle = new Rectangle(5,6);
        Assertions.assertEquals(22,rectangle.getPerimeter());
    }
}