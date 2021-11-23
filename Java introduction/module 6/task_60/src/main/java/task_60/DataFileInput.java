package task_60;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class DataFileInput {

    static void loadDataFromFile() throws IOException, URISyntaxException {

        byte[] fileBytes;

        try (InputStream input = new FileInputStream(DataFileLoader.filePath().getPath())) {

            fileBytes = input.readAllBytes();

            String text = new String(fileBytes);
            System.out.println(text);
        }
    }
}
