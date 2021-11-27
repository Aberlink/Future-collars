package task_68;

public class Main {

    public static void main(String[] args) {

        ImportPesel importPesel = new ImportPesel("85063102415");

        importPesel.checkLength();
        importPesel.checkIfNumberIsCorrect("9008s10441A");
    }
}
