package task_84;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Person  implements Comparable<Person>{

    String name;
    String surname;
    Integer birthYear;
    Integer height;
    Double weight;

    Set<Person> crew = new TreeSet<>();

    public Person(String name, String surname, int birthYear, int height, double weight) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.birthYear, o.birthYear);
    }

    void fillCrew(String name, String surname, int birthYear, int height, double weight) {
        crew.add(new Person(name, surname, birthYear, height, weight));
    }

    void sortByHeight() {
        TreeSet<Person> byHeight = new TreeSet<>(new PersonByHeightComparator().reversed());
        byHeight.addAll(crew);
        crew = byHeight;
    }

    void sortByWeight() {
        TreeSet<Person> byHeight = new TreeSet<>(new PersonByWeightComparator().reversed());
        byHeight.addAll(crew);
        crew = byHeight;
    }
}
