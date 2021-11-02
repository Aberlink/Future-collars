package task_42;

public abstract class Shapes {

    private double firstArg;
    private double secondArg;
    private double thirdArg;

    protected double firstDim;
    protected double secondDim;
    protected double thirdDim;

    public Shapes(double firstArg) {
        this.firstArg = firstArg;
        firstDim  = marksCheck(firstArg);
    }
    public Shapes(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        firstDim  = marksCheck(firstArg);
        secondDim = marksCheck(secondArg);
    }
    public Shapes(double firstArg, double secondArg, double thirdArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.thirdArg = thirdArg;
        firstDim  = marksCheck(firstArg);
        secondDim = marksCheck(secondArg);
        thirdDim = marksCheck(thirdArg);

    }


    protected double marksCheck(double args){
        if (args <= 0){
            throw new RuntimeException();
        }
        else {
            return args;
        }
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
