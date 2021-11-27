package task_60;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class DataFileToUpperCase {

    static String getDataToUpperCase() throws IOException, URISyntaxException {
        return DataFileInput.loadDataFromFile().toUpperCase();
    }

    static URI createOutputFile() throws URISyntaxException, IOException {

        URL outputPath = DataFileToUpperCase.class.getResource("/output.txt");
        File output = new File(outputPath.toURI());
        return output.toURI();
    }

    static void saveToOutputFile(String stringToSave, URI filePath) throws IOException {

        try (OutputStream outputStream = new FileOutputStream(filePath.getPath())) {
            outputStream.write(stringToSave.getBytes(StandardCharsets.UTF_8));
        }
    }
}




