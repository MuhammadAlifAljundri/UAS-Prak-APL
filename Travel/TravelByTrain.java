package Travel;

public class TravelByTrain implements TravelToAirport{
    @Override
    public void gotoAirport(){
        System.out.println("pergi ke bandara dengan kereta api seharga Rp 30.000");
    }
}
