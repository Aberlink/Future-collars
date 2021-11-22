public class DivisibilityByThreeChecker {


    public static void main(String[] args) {
        checkNumbersDivisibilityByThree(argumentsEntry(10));
    }


    public static void checkNumbersDivisibilityByThree(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            try {
                if (numbers[i] % 3 == 0) {
                    System.out.println(numbers[i]);
                }
                else throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException e) {
                System.out.println("Błąd!! Liczba " + numbers[i] + " nie jest podzielna przez 3");
            }
        }
    }

    static int[] argumentsEntry(int rangeToCheck){
        int[] array = new int[rangeToCheck];
        for (int i = 0; i < array.length; i++){
         array[i] = i;
        }
        return array;
    }

}
