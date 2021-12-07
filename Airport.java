import Travel.*;
import Schedule.*;
import Ticket.*;
import java.util.Scanner;

public class Airport {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Aplikasi Bandara Udara");
        System.out.println("1.Transportasi ke Bandara Udara\n2.Jadwal Penerbangan Indonesia-Jepang\n3.Pesan Tiket");
        System.out.print("pilih menu: ");
        int menu = Airport.in.nextInt();

        switch(menu) {
            case 1 :
                    new Airport().startTravelToAirport();
                    break;
            case 2 :
                    new Airport().startSchedule();
                    break; 
            case 3 :
                    new Airport().starOrderTicket();
                    break;              
            default :
                    System.out.println("tes");        
        }
    }

    // method untuk memanggil fitur Transportasi ke bandara
    void startTravelToAirport() {
        System.out.println("===========================================");
        System.out.println("silahkan pilih kendaraan untuk ke bandara: ");
        System.out.println("1.Bus\n2.Taksi\n3.Kereta");
        System.out.print("pilihan Anda : ");
        String transportation = Airport.in.next();
        Travel travel = null;
        travel = new Travel();

        if("Bus".equalsIgnoreCase(transportation) || Integer.parseInt(transportation) == 1) {
            travel.setTravelToAirport(new TravelByBus());
        }else if("Taksi".equalsIgnoreCase(transportation) || Integer.parseInt(transportation) == 2) {
            travel.setTravelToAirport(new TravelByTaxi());
        }else if("Kereta".equalsIgnoreCase(transportation) || Integer.parseInt(transportation) == 3) {
            travel.setTravelToAirport(new TravelByTrain());
        }
        travel.gotoAirport();

    }

    // method untuk memanggil fitur menampikan jadwal penerbangan
    void startSchedule(){
        System.out.println("=============================================================================");
        System.out.println("----------------->Jadwal Penerbagan rute Indonesia-Jepang<-------------------");
        
        IndonesianTime garuda = new GarudaIndonesia();
        JapanTimeAdapter garudaAdapter = new IndonesiaToJapanTimeAdapter(garuda);

        IndonesianTime lion = new LionAir();
        JapanTimeAdapter lionAdapter = new IndonesiaToJapanTimeAdapter(lion);

        IndonesianTime sriwijaya = new SriwijayaAir();
        JapanTimeAdapter sriwijayaAdapter = new IndonesiaToJapanTimeAdapter(sriwijaya);

        System.out.println("|---------------------------------------------------------------------------|");
        System.out.println("|             | Garuda Indonesia  |      Lion Air      |    Sriwijaya Air   |");
        System.out.println("|  Time Zone   -------------------------------------------------------------|");
        System.out.println("|             | Takeoff | Landing | TakeOff | Landing  | Takeoff | Landing  |");
        System.out.println("|---------------------------------------------------------------------------|");
        System.out.println("| IND(wib)    |    "+garuda.takeOffTime()+"    |   "+garuda.landingTime()+"    |    "+lion.takeOffTime()+"    |    "+lion.landingTime()+"    |    "+sriwijaya.takeOffTime()+"    |    "+sriwijaya.landingTime()+"   |");
        System.out.println("| Jepang(jst) |    "+garudaAdapter.takeOffTime()+"    |   "+garudaAdapter.landingTime()+"    |    "+lionAdapter.takeOffTime()+"    |    "+lionAdapter.landingTime()+"    |    "+sriwijayaAdapter.takeOffTime()+"    |    "+sriwijayaAdapter.landingTime()+"   |");
        System.out.println("|---------------------------------------------------------------------------|");
    }

    // method untuk memanggil fitur pesan tiket
    void starOrderTicket() {
        System.out.println("=======================================================================");
        System.out.print("Silahkan pilih tiket yang anda inginkan");
        System.out.println("\n1.Tiket kelas pertama\n2.Tiket kelas bisnis\n3.Tiket kelas ekonomomi");
        System.out.print("pilihan Anda : ");
        int order = Airport.in.nextInt();
        Ticket ticket = null;
        ticket = new Ticket();

        if(order == 1) {
            ticket.setOrderTicket(new FirstClassTicket());
        }else if(order == 2) {
            ticket.setOrderTicket(new BusinessClassTicket());
        }else if(order == 3) {
            ticket.setOrderTicket(new EconomyClassTicket());
        }else{
            System.out.println("tidak ada");
        }
        ticket.orderTicket();
    }

}

