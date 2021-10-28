package task_33;


public class Cinema {
    public static void main(String[] args) {

        TicketSeller ticketSeller = new TicketSeller("Tomasz", "Kamiski", 2010);

        System.out.println(ticketSeller.calculateMonthlySalary());
        System.out.println(ticketSeller.experience());

        Manager manager = new Manager("Piotr", "Kwiatkowski", 2010);

        System.out.println(manager.calculateMonthlySalary());
        System.out.println(manager.experience());

    }


}