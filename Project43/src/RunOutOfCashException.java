import java.io.IOException;

public class RunOutOfCashException extends IOException {
    public RunOutOfCashException(String message){
        super(message);
    }
}
