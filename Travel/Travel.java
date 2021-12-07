package Travel;

public class Travel{
    private TravelToAirport travelToAirport;

    public void setTravelToAirport(TravelToAirport travelToAirport) {
        this.travelToAirport = travelToAirport;
    }

    public TravelToAirport getTravelToAirport(){
        return travelToAirport;
    }

    public void gotoAirport() {
        travelToAirport.gotoAirport();
    }
}