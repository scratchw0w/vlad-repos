package hw;

public class MobilePhone implements AutoCloseable{
    @Override
    public void close(){
        System.out.println("Out of battery. Charge your phone.");
    }
}
