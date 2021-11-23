package task_60;

import java.io.IOException;
import java.net.URISyntaxException;

public class MarksInFileCounter {

    static int getNumberOfMarks() {
        try {
            return DataFileInput.loadDataFromFile().length();
        }
        catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return 0;
    }

    static void printNumberOfMarks() {
        System.out.println(getNumberOfMarks());
    }

}
