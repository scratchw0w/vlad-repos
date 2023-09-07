package TransportSystem;

public class Car implements Transport{
    private int destination;

    public Car(){}
    public Car(int destination){
        this.destination = destination;
    }

    @Override
    public void move() {
        System.out.println("Машина проехала на " + this.destination + " километров");
    }
}