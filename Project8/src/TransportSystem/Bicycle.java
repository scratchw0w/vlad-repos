package TransportSystem;

public class Bicycle implements Transport {
    private static final int DISTANCE_PER_MOVE = 13;
    private int destination;

    public Bicycle(int destination) {
        this.destination = destination;
    }

    @Override
    public void move() {
        this.destination = DISTANCE_PER_MOVE;
        System.out.println("Вы прокрутили педали на " + this.destination + " километров(+" + DISTANCE_PER_MOVE + " km)");
    }
}
