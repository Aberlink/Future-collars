package task_84;

import java.util.*;

public class Crew {



    public static void main(String[] args) {

        Person person = new Person();

        person.fillCrew("Jan", "Kowalski",1985,180,80);
        person.fillCrew("Adam","Kwiatkowski",1994,174,84);
        person.fillCrew("Tomasz","Nowak",2001,142,101);
        person.fillCrew("Anna","Polak",1999,162,54);

        System.out.println(person.crew);
        person.sortByHeight();
        System.out.println(person.crew);
        person.sortByWeight();
        System.out.println(person.crew);
    }
}
