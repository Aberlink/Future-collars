package task_68;

public class ImportPesel {

    private final String peselInput;

    public ImportPesel(String peselInput) {
        this.peselInput = peselInput;
    }

    boolean checkLength() {
        if (peselInput.length() == 11) {
            return true;
        }
        else throw new IllegalLengthException("Number should be 11 characters long");
    }

    long checkIfNumberIsCorrect(String number){
        if (checkLength() == true) {
            try {
                return Long.parseLong(number);
            }
            catch (NumberFormatException e) {
                throw new WrongTypeOfDataException("All characters have to be numbers");
            }
        }
        else throw new IllegalLengthException("Number should be 11 characters long");
    }
}
