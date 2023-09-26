package practise;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(0, "Ferrari");
        car.increaseSpeed();
        System.out.println(car);
        car.decreaseSpeed();
        System.out.println(car);
        //        car.pedalController();
//        String fuelType = car.petrolPumpFuelController();
//        car.engineController(20, fuelType);
//        System.out.println(car);
//        car.pedalController();
//        String fuelType2 = car.petrolPumpFuelController();
//        car.engineController(-20, fuelType2);
//        System.out.println(car);
    }
}
