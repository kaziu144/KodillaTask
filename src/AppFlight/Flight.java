package AppFlight;

class Main {

    public static void main(String[] args) {
        Flight America = new Flight("Waszyngton", "NewJork");
        System.out.println(America.infoFlight());

    }

}
class Flight{
    String depature;
    String arrival;


    public Flight(String depature , String arrival){

        this.depature=depature;
        this.arrival=arrival;


    }
    public String infoFlight(){
        return "Flight from "+this.depature+" to "+this.arrival;
    }

}