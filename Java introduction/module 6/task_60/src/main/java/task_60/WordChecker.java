package task_60;

import java.io.IOException;
import java.net.URISyntaxException;

public class WordChecker {

    static boolean isWordPresent(String wordToCheck) {
        try {
            return DataFileInput.loadDataFromFile().contains(wordToCheck);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return false;
    }
}
