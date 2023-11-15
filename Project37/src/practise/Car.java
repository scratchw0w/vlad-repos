package practise;

public class Car implements AutoCloseable{

    @Override
    public void close(){
        System.out.println("Run out of gazoline");
    }
}
