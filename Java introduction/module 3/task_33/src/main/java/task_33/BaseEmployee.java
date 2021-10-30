package task_33;

public abstract class BaseEmployee {

    final String name;
    final String surname;
    final int workStarYear;
    int currentYear = 2021;

    protected double BASE_SALARY = 3000d;

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
