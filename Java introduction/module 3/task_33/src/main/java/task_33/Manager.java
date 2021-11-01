package task_33;


class Manager extends BaseEmployee{

    protected double salaryBonus = 500d;


    public Manager(String name, String surname, int workStarYear) {
        super(name, surname, workStarYear);
        this.setBaseSalary(5000d);
    }

    public Manager(String name, String surname, int workStarYear, double salaryBonus) {
        super(name, surname, workStarYear);
        this.salaryBonus = salaryBonus;
        this.setBaseSalary(5000d);
    }


    double calculateMonthlySalary() {
        return setBaseSalary(5000d) + salaryBonus;
    }


}
