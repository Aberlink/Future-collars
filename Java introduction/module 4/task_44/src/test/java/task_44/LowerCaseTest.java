package task_44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseTest {

    LowerCaseFormatter lowerCaseFormatter = new LowerCaseFormatter();

    @Test
    void formatText_toLowerCaseLetters() {
        String text = "EnGiNe";
        Assertions.assertEquals("engine", lowerCaseFormatter.formatText(text));
    }
}