package TransportSystem;

public class Airplane implements Transport{
    private int destination;

    public Airplane() {
    }
    public Airplane(int destination){
        this.destination = destination;
    }
    public void move(){
        System.out.println("Самолет пролетел " + this.destination + " километров");
    }
}
