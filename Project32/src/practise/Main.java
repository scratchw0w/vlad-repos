package practise;

import java.io.IOException;

public class Main {

    public static void A() throws IOException{
        throw new IOException();
    }

    public static void B(){
        throw new RuntimeException();
    }
    public static void main(String[] args){
        try {
//            B();
            System.out.println("In try");
            throw new IOException();
        }
        catch (IOException ioException){

        }
        catch (Exception exception){
            System.out.println("In catch");
            throw new UnsupportedOperationException();
        }
//        finally {
//            System.out.println("In finally");
//        }
    }
}
