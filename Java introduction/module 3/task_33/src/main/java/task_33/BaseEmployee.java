package task_33;

public abstract class BaseEmployee {

    private final String name;
    private final String surname;
    private final int workStarYear;
    double baseSalary = 3000;

    public BaseEmployee(String name, String surname, int workStarYear) {
        this.name = name;
        this.surname = surname;
        this.workStarYear = workStarYear;
    }
    int experience() {
        int experience = 2021 - workStarYear;
        return experience;
    }
    abstract double calculateMonthlySalary();

}
