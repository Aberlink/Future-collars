package task_60;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class DataFileLoader {

    public static void main(String[] args) throws IOException, URISyntaxException {

    DataFileOutput.getFileFilled("Kurs\n" + "Java\n" + "Lekcja 6\n" + "Pliki\n" + "Wyjątki\n" +
                                             "Pliki\n" + "Koniec pliku");
    }

    public static java.net.URI filePath() throws URISyntaxException {
        URL resourcePath = DataFileLoader.class.getResource("/data.txt");
        File data = new File(resourcePath.toURI());
        return data.toURI();
    }


}
