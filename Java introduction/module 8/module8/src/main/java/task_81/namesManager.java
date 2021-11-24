package task_81;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class namesManager {
    public static void main(String[] args) throws URISyntaxException, IOException {

        getNamesFromFile();

    }

    static void getNamesFromFile() throws IOException {

        File namesFile = new File("/src/main/resources/names.txt");
        namesFile.createNewFile();
    }
}
