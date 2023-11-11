package practise;

public class Computer implements AutoCloseable {
    private boolean turnedOn;

    public Computer() {
        this.turnedOn = true;
    }

    public void showStatus() {
        System.out.println("Your computer is " + (this.turnedOn ? "working" : "not working"));
    }

    @Override
    public void close(){
        System.out.println("Your computer is shutting down");
        this.turnedOn = false;
    }
}
