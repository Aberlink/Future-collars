package task_60;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {

        URL resourcePath = Main.class.getResource("data.txt");

        File data = new File(resourcePath.toURI());

        String systemOptions = "Kurs\n" + "Java\n" + "Lekcja 6\n" + "Pliki\n" + "Wyjątki\n" + "Pliki\n" + "Koniec pliku";

        OutputStream outputStream = new FileOutputStream(data);
        outputStream.write(systemOptions.getBytes(StandardCharsets.UTF_8));
    }


}
