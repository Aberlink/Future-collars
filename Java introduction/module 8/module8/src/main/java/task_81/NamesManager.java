package task_81;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class NamesManager {

    public static void main(String[] args) {

        System.out.println(getReversedListOfNames());
        System.out.println(getDuplicatesRemoved());
        System.out.println(getNamesReplaced(getReversedListOfNames(),"Anna","Joanna"));

    }

    protected static List<String> getReversedListOfNames() {

        List<String> reversedListOfNames = importNamesFromFile();
        Collections.reverse(reversedListOfNames);
        return reversedListOfNames;
    }

    protected static List<String> getNamesReplaced (List<String> listToCHeck, String nameToBeReplaced,
                                          String nameToBePlacedInstead) {

        for(int i = 0; i < listToCHeck.size(); i++) {

            if(listToCHeck.indexOf(nameToBeReplaced) == i) {
                listToCHeck.remove(i);
                listToCHeck.add(i,nameToBePlacedInstead);
            }
        }
        return listToCHeck;
    }

    protected static Set<String> getDuplicatesRemoved() {

        Set<String> duplicatesRemoved = new HashSet<>(importNamesFromFile());
        return  duplicatesRemoved;
    }

    private static Path loadNamesFile() throws URISyntaxException {
        URL namesPath = NamesManager.class.getResource("/names.txt");
        File namesFile = new File(namesPath.toURI());
        return namesFile.toPath();
    }

    private static List<String> importNamesFromFile() {

        LinkedList<String> listOfNames = new LinkedList<>();

        try (BufferedReader reader = Files.newBufferedReader(loadNamesFile())) {

            String nextLine = reader.readLine();

            while (nextLine != null) {
                listOfNames.add(nextLine);
                nextLine = reader.readLine();
            }

        } catch (IOException | URISyntaxException e) {
            listOfNames.add("");
        }
        return listOfNames;
    }
}
