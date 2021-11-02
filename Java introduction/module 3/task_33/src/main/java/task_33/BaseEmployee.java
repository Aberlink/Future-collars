package task_33;

public abstract class BaseEmployee {

    private final String name;
    private final String surname;
    private final int workStarYear;
    private double baseSalary = 3000d;
    int currentYear = 2021;

    protected double setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
        return baseSalary;
    }

    protected double getBaseSalary() {
        return baseSalary;
    }

    public BaseEmployee(String name, String surname, int workStarYear) {
        this.name = name;
        this.surname = surname;
        this.workStarYear = workStarYear;
    }

    int experience() {
        return currentYear - workStarYear;
    }

    abstract double calculateMonthlySalary();

}
