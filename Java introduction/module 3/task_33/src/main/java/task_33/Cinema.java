package task_33;


public class Cinema {
    public static void main(String[] args) {

        BaseEmployee ticketSeller = new TicketSeller("Tomasz", "Kamiski", 2010);

        System.out.println(ticketSeller.calculateMonthlySalary());
        System.out.println(ticketSeller.experience());

        BaseEmployee manager = new Manager("Robert", "Kaminski", 2017);

        System.out.println(manager.calculateMonthlySalary());
        System.out.println(manager.experience());

        BaseEmployee manager2 = new Manager("Piotr", "Kwiatkowski", 2015, 800);

        System.out.println(manager2.calculateMonthlySalary());
        System.out.println(manager2.experience());
    }


}