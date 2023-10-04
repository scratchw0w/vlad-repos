package practise;

public class Car {
    private int speed;
    private String model;

    private boolean validateSpeed(int speed) {
        return speed > 0 && speed <= 300;
    }

    public Car(int speed, String model) {
        this.model = model;
        if (validateSpeed(speed)) {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        if (validateSpeed(speed)) {
            this.speed = speed;
        }
    }

    private void pedalController() {
        System.out.println("Pedal controller started working. ");
    }

    private String petrolPumpFuelController(){
        System.out.println("Petrol pump fuel controller started working. ");
        return "Petrol";
    }

    private String electricityPumpFuelController(){
        System.out.println("Electricity pump fuel controller started working. ");
        return "Electricity";
    }

    private void engineController(int numberOfFuel, String fuelType){
        System.out.printf("Engine controller started working on %s fuel \n", fuelType);
        this.speed += numberOfFuel;
    }

    public void decreaseSpeed() {
        pedalController();
        String fuelType = electricityPumpFuelController();
        engineController(-20, fuelType);
    }

    public void increaseSpeed() {
        pedalController();
        String fuelType = electricityPumpFuelController();
        engineController(20, fuelType);
    }

    @Override
    public String toString() {
        return this.speed + "";
    }
}
