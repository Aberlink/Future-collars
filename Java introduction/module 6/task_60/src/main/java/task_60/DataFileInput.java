package task_60;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class DataFileInput {

    static String loadDataFromFile() throws IOException, URISyntaxException {

        byte[] fileBytes;

        try (InputStream input = new FileInputStream(DataFileLoader.filePath().getPath())) {
            fileBytes = input.readAllBytes();
            return  new String(fileBytes);
        }
    }

    static void printDataFromFile() throws IOException, URISyntaxException {
        System.out.println(loadDataFromFile());
    }
}
