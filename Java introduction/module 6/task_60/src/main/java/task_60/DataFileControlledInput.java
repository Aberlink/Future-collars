package task_60;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataFileControlledInput {

    static void loadEveryNLine(int startLine, int everyNLineToRead) throws URISyntaxException, IOException {

        try (BufferedReader reader = Files.newBufferedReader(Path.of(DataFileLoader.filePath()))) {

            String lineToPrint;
            int counter = 0;

            while ((lineToPrint = reader.readLine()) != null) {
                counter++;
                if ((startLine + counter) % everyNLineToRead == 0) {
                    System.out.println(lineToPrint);
                }
            }
        }
    }

}
