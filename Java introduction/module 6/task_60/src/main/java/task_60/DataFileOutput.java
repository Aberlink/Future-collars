package task_60;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class DataFileOutput {



     static void getFileFilled(String systemOptions) throws IOException, URISyntaxException {

        try (OutputStream outputStream = new FileOutputStream(DataFileLoader.filePath().getPath())) {
            outputStream.write(systemOptions.getBytes(StandardCharsets.UTF_8));
        }
    }
}
