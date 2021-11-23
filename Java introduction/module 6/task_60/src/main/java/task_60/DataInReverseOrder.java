package task_60;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataInReverseOrder {

    private static int countLines() throws URISyntaxException, IOException {

        try(BufferedReader reader = Files.newBufferedReader(Path.of(DataFileLoader.filePath())))  {

            int lines = 0;
            while (reader.readLine() != null){
                lines++;
            }
            return lines;
        }
    }

    public static <String> List<String> getFileToList() {

        try (BufferedReader reader = Files.newBufferedReader(Path.of(DataFileLoader.filePath()))) {

            ArrayList<String> spreadLines = new ArrayList<>();

            for (int i = 0; i <countLines(); i++) {
                spreadLines.add((String) reader.readLine());
            }
            return spreadLines;

    } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getFileInReverseOrder() {

        ArrayList<String> reversedLines =  new ArrayList<>();
        reversedLines.addAll(getFileToList());

        Collections.reverse(reversedLines);
        return reversedLines.toString();
    }
}
