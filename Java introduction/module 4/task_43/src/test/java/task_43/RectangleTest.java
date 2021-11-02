package task_43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area_twoAndFour() {
        Rectangle rectangle = new Rectangle(2,4);
        Assertions.assertEquals(8,rectangle.area());
    }

    @Test
    void perimeter_twoAndFour() {
        Rectangle rectangle = new Rectangle(2,4);
        Assertions.assertEquals(12,rectangle.perimeter());
    }
}