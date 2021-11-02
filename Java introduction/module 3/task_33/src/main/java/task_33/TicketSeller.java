package task_33;

class TicketSeller extends BaseEmployee{

    public TicketSeller(String name, String surname, int workStarYear) {
        super(name, surname, workStarYear);
    }

    double calculateMonthlySalary() {
        return getBaseSalary();
    }
}

