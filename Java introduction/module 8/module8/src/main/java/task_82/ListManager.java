package task_82;

import java.util.Arrays;

public class ListManager implements OwnList{


    private int[] listToManage = new int[0];

    public ListManager() {
    }

    @Override
    public int size() {
        return listToManage.length;
    }

    @Override
    public boolean isEmpty() {
        if(size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void add(Integer element) {
      int[] temporary = Arrays.copyOf(listToManage,listToManage.length + 1);
      temporary[temporary.length - 1] = element;
      listToManage = temporary;
    }

    @Override
    public Integer get(int i) {
        if(0 <= i && i < listToManage.length) {
            return listToManage[i];
        }
            throw new IndexOutOfBoundsException();
    }

    @Override
    public void add(int index, Integer element) {
        if(0 <= index && index < listToManage.length + 1) {
            int[] temporary = new int[listToManage.length + 1];
            System.arraycopy(listToManage, 0, temporary, 0, index);
            temporary[index] = element;
            System.arraycopy(listToManage, index, temporary, index + 1, listToManage.length - index);
            listToManage = temporary;
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Integer remove(int index) {

        if(0 <= index && index < listToManage.length) {
            int[] temporary = new int[listToManage.length - 1];
            System.arraycopy(listToManage, 0, temporary, 0, index);
            System.arraycopy(listToManage, index + 1, temporary, index, temporary.length - index);
            listToManage = temporary;
            return index;
        }
            throw new IndexOutOfBoundsException();
    }
}
