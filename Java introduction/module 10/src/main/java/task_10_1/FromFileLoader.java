package task_10_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FromFileLoader {

    public void loadBookFromFile() {

        List<PhoneBook> phoneBook = new ArrayList<>();

        File book = new File("src/main/resources/book.csv");

        try (BufferedReader readBook = Files.newBufferedReader(Path.of(book.getPath()))) {

            String nextLine = readBook.readLine();

            while (nextLine != null) {
                String[] separatedData = nextLine.split(",");
                PhoneBook nextPosition = addNextPosition(separatedData);
                phoneBook.add(nextPosition);
                nextLine = readBook.readLine();

            }
        } catch (IOException e) {
            System.out.println("File not found");
        }

    }

    private PhoneBook addNextPosition(String[] data) {
        String address = data[0];
        String fullName = data[1];
        String phoneNumber = data[2];
        return new PhoneBook(address, fullName, phoneNumber);
    }

}
