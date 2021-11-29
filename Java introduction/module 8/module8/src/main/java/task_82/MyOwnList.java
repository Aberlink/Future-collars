package task_82;

import java.util.Arrays;

public class MyOwnList {

    public static void main(String[] args) {


        ListManager listManager = new ListManager();

        listManager.add(1);
        listManager.add(2);
        listManager.add(3);
        listManager.add(4);
        listManager.add(5);

        listManager.add(1,20);
        listManager.add(4,50);


        System.out.println(listManager.size());
        System.out.println(listManager.get(4));
        System.out.println(listManager.isEmpty());
        System.out.println(listManager.remove(4));
    }
}
