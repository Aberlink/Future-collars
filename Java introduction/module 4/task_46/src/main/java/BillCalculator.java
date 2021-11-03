public class BillCalculator {



    float calculate(double billValue, float serviceFee) {
        return (float) (billValue + serviceFee);
    }

    float calculate(double billValue, float serviceFee, double discount) {
        if (discount == 0) {
            return (float) (billValue + serviceFee);
        }
        else {
            return (float) (billValue * discount) + serviceFee;
        }
    }

    float calculate(double billValue, float serviceFee, short packing) {
        return (float) billValue + serviceFee + packing;
    }

}
