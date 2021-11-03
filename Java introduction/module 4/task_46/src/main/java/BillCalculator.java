public class BillCalculator {



    float calculate(double billValue, float serviceFee) {
        return (float) (billValue + serviceFee);
    }

    float calculate(double billValue, float serviceFee, double discountInPercents) {

        return (float) (billValue * (1 - discountInPercents / 100)) + serviceFee;
    }

    float calculate(double billValue, float serviceFee, short packing) {
        return (float) billValue + serviceFee + packing;
    }

}
