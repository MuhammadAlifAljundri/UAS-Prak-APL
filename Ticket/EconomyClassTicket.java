package Ticket;

public class EconomyClassTicket implements OrderTicket {
    @Override
    public void selectTicket() {
        System.out.println("Anda memesan tiket kelas ekonomi dengan rute IND-JPN seharga 12 juta");
    }
}
