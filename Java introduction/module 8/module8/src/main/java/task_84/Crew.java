package task_84;

import java.util.*;

public class Crew {

    static List<Person> crew = new ArrayList<>();

    public static void main(String[] args) {

        fillCrew();
        sortByHeight();
        sortByWeight();
        sortByAge();
    }

    public static void sortByHeight(){
        Comparator<Person> compareByHeight = (o1, o2) -> o1.height.compareTo(o2.height);
        crew.sort(compareByHeight);
    }

    public static void sortByWeight(){
        Comparator<Person> compareByWeight = (o1, o2) -> o1.weight.compareTo(o2.weight);
        crew.sort(compareByWeight.reversed());
    }
    public static void sortByAge(){
        Comparator<Person> compareByAge = (o1, o2) -> o1.birthYear.compareTo(o2.birthYear);
        crew.sort(compareByAge.reversed());
    }



    private static List<Person> getCrew(Person person) {
        crew.add(person);
        return crew;
    }
    private static void fillCrew(){
        Person plumber = new Person("Jan", "Kowalski",1985,180,80);
        getCrew(plumber);
        Person carpenter = new Person("Adam","Kwiatkowski",1994,174,84);
        getCrew(carpenter);
        Person tailor = new Person("Tomasz","Nowak",1958,192,101);
        getCrew(tailor);
        Person waitress = new Person("Anna","Polak",1999,162,54);
        getCrew(waitress);
        sortByAge();
    }



}
