package task_82;

public class ListManager implements OwnList{

    static int[] listToManage = new int[10];

    public ListManager() {
    }

    @Override
    public int size() {
        return listToManage.length;
    }

    @Override
    public boolean isEmpty() {
        boolean temporaryIsNotEmpty = false;
        for (int arguments : listToManage) {
            if (arguments != Integer.parseInt(null)){
                temporaryIsNotEmpty = true;
            }
        }
        return temporaryIsNotEmpty;
    }

    @Override
    public void add(Integer element) {

    }

    @Override
    public Integer get(int i) {
        return null;
    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {
        return null;
    }
}
