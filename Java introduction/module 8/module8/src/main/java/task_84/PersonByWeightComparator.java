package task_84;

import java.util.Comparator;

public class PersonByWeightComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.weight.compareTo(o2.weight);
    }

}
