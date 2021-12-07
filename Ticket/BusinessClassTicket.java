package Ticket;

public class BusinessClassTicket implements OrderTicket{
    @Override
    public void selectTicket() {
        System.out.println("Anda memesan tiket kelas bisnis dengan rute IND-JPN seharga 20 juta");
    }
}
