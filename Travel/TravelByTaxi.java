package Travel;

public class TravelByTaxi implements TravelToAirport{
    @Override
    public void gotoAirport(){
        System.out.println("pergi ke bandara dengan taxi seharga Rp 4000 per KM");
    }
}
