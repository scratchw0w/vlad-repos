package TransportSystem;

public class Car implements Transport {
    private static final int DISTANCE_PER_MOVE = 29;
    private int destination;

    public Car(int destination) {
        this.destination = destination;
    }

    @Override
    public void move() {
        this.destination += DISTANCE_PER_MOVE;
        System.out.println("Машина проехала на " + this.destination + " километров(+" + DISTANCE_PER_MOVE + " km)");
    }
}