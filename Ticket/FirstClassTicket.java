package Ticket;

public class FirstClassTicket implements OrderTicket {
    @Override
    public void selectTicket(){
        System.out.println("Anda memesan tiket kelas pertama dengan rute IND-JPN seharga 33 juta");
    }
}