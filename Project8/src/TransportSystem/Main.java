package TransportSystem;

public class Main {
    public static void main(String[] args){
        Transport car = new Car(207);
        Transport bike = new Bicycle(177);
        Transport airplane = new Airplane(1207);

        car.move();
        car.move();
        bike.move();
        airplane.move();
    }
}
