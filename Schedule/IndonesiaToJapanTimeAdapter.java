package Schedule;

public class IndonesiaToJapanTimeAdapter implements JapanTimeAdapter{
    private IndonesianTime indonesianTime;

    public IndonesiaToJapanTimeAdapter(IndonesianTime indonesianTime){
        this.indonesianTime = indonesianTime;
    }

    @Override
    public int takeOffTime(){
        int time = indonesianTime.takeOffTime();
        return convertIndToJpnTime(time);
    }

    @Override
    public int landingTime(){
        int time = indonesianTime.landingTime();
        return convertIndToJpnTime(time);
    }

    // mengkonversi waktu indonesia ke jepang
    private int convertIndToJpnTime(int time) {
        return time + 2;
    }

}