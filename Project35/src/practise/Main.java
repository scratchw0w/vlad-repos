package practise;

public class Main {
    public static void main(String[] args) {
//        try{
//           // while (true){
//                System.out.println("In try");
//            //}
//            //System.exit(0);
//            //Daemon Thread In Try
//        }
//        catch (Exception exception){
//            System.out.println("In catch");
//        }
//        finally {
//            System.out.println("In finally");
//        }
        try(Computer computer = new Computer()){
            System.out.println("In try");
            computer.showStatus();
            throw new ComputerOutOfBatteryException("Your computer is out of battery");
        }
    }
}
