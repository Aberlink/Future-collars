public class BillCalculator {

    double billValue;
    float serviceFee;
    double discount;
    short packing;

    float calculate(double billValue, float serviceFee) {
        return (float) (billValue + serviceFee);
    }

    float calculateWithDiscount(double billValue, float serviceFee, double discount) {
        return (float) (billValue * discount) + serviceFee;
    }

    float calculateWithPacking(double billValue, float serviceFee, double discount, short packing) {
        return (float) (billValue * discount) + serviceFee + packing;
    }

}
