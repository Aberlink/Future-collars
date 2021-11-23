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

    public static List<String> getFileToList() throws URISyntaxException, IOException {

        try (BufferedReader reader = Files.newBufferedReader(Path.of(DataFileLoader.filePath()))) {

            ArrayList<String> spreadLines = new ArrayList<>();
            String temporaryText = reader.readLine();

            while (temporaryText != null) {
                spreadLines.add(temporaryText);
                temporaryText = reader.readLine();
            }
            return spreadLines;
        }
    }

    public static String getFileInReverseOrder() throws URISyntaxException, IOException {

        ArrayList<String> reversedLines = new ArrayList<>(getFileToList());

        StringBuffer output = new StringBuffer();

        for (int i = reversedLines.size() - 1; i >= 0; i--) {
            output.append(reversedLines.get(i) + "\n");
        }
        return output.toString();
    }
}
