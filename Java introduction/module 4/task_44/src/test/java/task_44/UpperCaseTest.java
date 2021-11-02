package task_44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {

    UpperCase upperCase = new UpperCase();

    @Test
    void formatText() {
        String text = "EnGiNe";
        Assertions.assertEquals("ENGINE",upperCase.formatText(text));
    }
}