package task_68;

public class ImportPesel {

    String peselInput;

    public ImportPesel(String peselInput) {
        this.peselInput = peselInput;
    }

    boolean checkLength() {
        if (peselInput.length() == 11) {
            return true;
        }
        else throw new RuntimeException("IllegalLengthException");
    }

    long checkInputType(){
        try {
            return Long.parseLong(this.peselInput);
        }
        catch (RuntimeException e) {
            throw new RuntimeException("WrongTypeOfDataException");
        }
    }

    long checkIfNumberIsCorrect(String number){
        if (number.length() == 11) {
            try {
                return Long.parseLong(number);
            } catch (NumberFormatException e) {
                throw new ExtendedExceptions("WrongTypeOfDataException");
            }
        }
        else throw new ExtendedExceptions("IllegalLengthException");

    }
}
