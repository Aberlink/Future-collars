package task_10_1;

import com.sun.jdi.ObjectCollectedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class PhoneBookListManager {

    List<PhoneBook> phoneBookList = new ArrayList<>();

    public void loadBookFromFile() {

        URL url = PhoneBookListManager.class.getResource("/book.csv");

        try (BufferedReader readBook = Files.newBufferedReader(Path.of(url.toURI()))) {

            String nextLine = readBook.readLine();

            while (nextLine != null) {
                String[] separatedData = nextLine.split(",");
                String[] oneLine = Arrays.copyOf(separatedData, 3);

                PhoneBook nextPosition = addNextPosition(oneLine);
                phoneBookList.add(nextPosition);

                nextLine = readBook.readLine();
            }
        } catch (IOException | URISyntaxException e) {
            System.out.println("file load error");
        }
    }

    private PhoneBook addNextPosition(String[] data) {
        String address = data[0];
        String fullName = data[1];
        String phoneNumber = data[2];

        return new PhoneBook(address, fullName, phoneNumber);
    }

    protected PhoneBook findByName(String nameToBeFound) {
        for (PhoneBook person : phoneBookList) {
            if (person.getFULLNAME().equals(nameToBeFound)) {
                return person;
            }
        }
        throw new ObjectCollectedException();
    }
}
