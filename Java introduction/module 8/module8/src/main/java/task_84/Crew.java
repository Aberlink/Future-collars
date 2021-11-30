package task_84;

import java.util.*;

public class Crew {

    private static Set<Person> crew = new TreeSet<>();

    public static void main(String[] args) {

        fillCrew("Jan", "Kowalski",1985,180,80);
        fillCrew("Adam","Kwiatkowski",1994,174,84);
        fillCrew("Tomasz","Nowak",1958,192,101);
        fillCrew("Anna","Polak",1999,162,54);

        TreeSet<Person> byHeight = new TreeSet<>(new PersonByHeightComparator().reversed());
        byHeight.addAll(crew);
        crew = byHeight;

    }

    static void fillCrew(String name, String surname, int birthYear, int height, double weight) {
        crew.add(new Person(name, surname, birthYear, height, weight));
    }


}
