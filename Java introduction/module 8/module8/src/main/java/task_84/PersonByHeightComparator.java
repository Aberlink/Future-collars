package task_84;

import java.util.Comparator;

public class PersonByHeightComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.height.compareTo(o2.height);
    }

}
