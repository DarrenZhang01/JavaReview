
public class ProxyTicketStation implements Ticket {

    private int money = 0;
    private Ticket ticket;
    // Create a constructor for the input
    public ProxyTicketStation (int amount) {
        this.money = amount;
    }
    public void printTicket () {
        if (this.money > 20 || this.money == 20) {
            ticket = new TicketStation();
            ticket.printTicket();
        }
        else {
            System.out.println("You need 20 dollars for a ticket.");
        }
    }
}
