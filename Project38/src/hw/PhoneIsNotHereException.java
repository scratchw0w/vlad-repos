package hw;

public class PhoneIsNotHereException extends RuntimeException{
    public PhoneIsNotHereException(String message){
        super(message);
    }
}
