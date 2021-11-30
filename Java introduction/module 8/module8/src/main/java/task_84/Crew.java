package task_84;

import java.util.*;

public class Crew {

    private static final List<Person> crew = new LinkedList<>();

    public static void main(String[] args) {

        fillCrew("Jan", "Kowalski",1985,180,80);
        fillCrew("Adam","Kwiatkowski",1994,174,84);
        fillCrew("Tomasz","Nowak",1958,192,101);
        fillCrew("Anna","Polak",1999,162,54);

        sortByHeight();
        sortByWeight();
        sortByAge();
        System.out.println(crew);
    }

    public static void sortByHeight(){
        Comparator<Person> compareByHeight = Comparator.comparing(o -> o.height);
        crew.sort(compareByHeight);
    }

    public static void sortByWeight(){
        Comparator<Person> compareByWeight = Comparator.comparing(o -> o.weight);
        crew.sort(compareByWeight.reversed());
    }

    public static void sortByAge(){
        Comparator<Person> compareByAge = Comparator.comparing(o -> o.birthYear);
        crew.sort(compareByAge.reversed());
    }


    static void fillCrew(String name, String surname, int birthYear, int height, double weight) {
        crew.add(new Person(name, surname, birthYear,height,weight));
        sortByAge();
    }
}
