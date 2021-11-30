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

    public Person(String name, String surname, int birthYear, int height, double weight) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.birthYear, o.birthYear);
    }
}
