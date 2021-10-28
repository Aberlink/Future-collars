package task_33;

import java.util.Scanner;

class Manager extends BaseEmployee{

    private double bonus = 500d;


    public Manager(String name, String surname, int workStarYear) {
        super(name, surname, workStarYear);
    }

    private double bonus() {
        System.out.println("Use default bonus value? Type 0 for standard, 1 for manual");
        Scanner scanner = new Scanner(System.in);
        int bonusShape = scanner.nextInt();
        if (bonusShape == 1) {
            System.out.println("Type value of bonus");
            double bonusManualValue = scanner.nextDouble();
            bonus = bonusManualValue;
            return bonus;
        }
        else {
            return bonus;
        }
    }


    double calculateMonthlySalary() {
        baseSalary = 5000;
        double totalSalary = baseSalary + bonus();
        return  totalSalary;
    }


}
