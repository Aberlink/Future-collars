package task_44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {

    UpperCaseFormatter upperCaseFormatter = new UpperCaseFormatter();

    @Test
    void formatText_toCapitalLetters() {
        String text = "EnGiNe";
        Assertions.assertEquals("ENGINE",upperCaseFormatter.formatText(text));
    }
}