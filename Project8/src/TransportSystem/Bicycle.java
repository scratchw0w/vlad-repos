package TransportSystem;

public class Bicycle implements Transport {
    private int destination;

    public Bicycle() {
    }

    public Bicycle(int destination) {
        this.destination = destination;
    }

    public void move() {
        System.out.println("Вы прокрутили педали на " + this.destination + " километров");
    }
}
