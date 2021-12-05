package task_10_1;

public class Main {

    public static void main(String[] args) {

        FromFileLoader fromFileLoader = new FromFileLoader();
        fromFileLoader.loadBookFromFile();

        System.out.println(String.valueOf(fromFileLoader.phoneBook.get(4)));

    }
}
