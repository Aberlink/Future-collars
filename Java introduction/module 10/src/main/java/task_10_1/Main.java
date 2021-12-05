package task_10_1;

public class Main {

    public static void main(String[] args) {

        PhoneBookListManager phoneBookListManager = new PhoneBookListManager();
        phoneBookListManager.loadBookFromFile();

        phoneBookListManager.findByName("Roman Chudy");

    }
}
