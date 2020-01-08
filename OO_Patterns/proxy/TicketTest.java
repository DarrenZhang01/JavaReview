
public class TicketTest {

    public static void main (String[] args) {
        Ticket buy = new ProxyTicketStation(10);
        // The purchase action fails becaues we do not have enough money.
        buy.printTicket();

        Ticket buyAgain = new ProxyTicketStation(20);
        // This time the purchase will be a success.
        buyAgain.printTicket();
    }
}
