package TransportSystem;

public class Airplane implements Transport {
    private static final int DISTANCE_PER_MOVE = 159;
    private int destination;

    public Airplane(int destination) {
        this.destination = destination;
    }

    @Override
    public void move() {
        this.destination += DISTANCE_PER_MOVE;
        System.out.println("Самолет пролетел " + this.destination + " километров(+" + DISTANCE_PER_MOVE + "km)");
    }
}
