package task_44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseTest {

    LowerCase lowerCase = new LowerCase();

    @Test
    void formatText() {
        String text = "EnGiNe";
        Assertions.assertEquals("engine", lowerCase.formatText(text));
    }
}