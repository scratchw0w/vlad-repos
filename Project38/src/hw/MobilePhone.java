package hw;

public class MobilePhone implements AutoCloseable {
    private String name;
    @Override
    public void close() {
        System.out.println("Out of battery. Charge your phone.");
    }

    public MobilePhone() {
    }

    public MobilePhone(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
