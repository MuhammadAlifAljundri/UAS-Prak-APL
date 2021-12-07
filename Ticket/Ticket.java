package Ticket;

public class Ticket {
    private OrderTicket orderTicket;

    public void setOrderTicket(OrderTicket orderTicket) {
        this.orderTicket = orderTicket;
    }

    public OrderTicket getOrderTicket() {
        return orderTicket;
    }

    public void orderTicket() {
        orderTicket.selectTicket();
    }
}
