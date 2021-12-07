package Travel;

public class TravelByBus implements TravelToAirport{
    @Override
    public void gotoAirport(){
        System.out.println("Pergi ke Bandara dengan Bus seharga Rp 85.000");
    }
}
