package task_82;

import java.util.Arrays;

public class MyOwnList {

    public static void main(String[] args) {


        ListManager listManager = new ListManager();

        listManager.add(2);
        listManager.add(0,5);
        listManager.add(12,5);


        System.out.println(listManager.size());
        System.out.println(listManager.get(12));
        System.out.println(listManager.isEmpty());
        System.out.println(listManager.remove(12));
        System.out.println(Arrays.toString(listManager.listToManage));
    }
}
