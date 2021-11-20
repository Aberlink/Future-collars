package task_68;

public class Main {

    public static void main(String[] args) {

        ImportPesel importPesel = new ImportPesel("95083109410");

        importPesel.checkLength();
        importPesel.checkInputType();
        importPesel.checkIfNumberIsCorrect("9508310941A");
    }
}
