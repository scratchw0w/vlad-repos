package practise;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
//        Map<String, Integer> map = new HashMap<>();
//        map.put("key", 1);
//        "key".hashCode();
 //       methodB();
        try {
            methodA();
        }
        catch (IOException exception){
            System.err.println(exception);
        }
    }

    public static void methodA() throws IOException {
        throw new IOException();
    }

    public static void methodB() {
        try {
            throw new IOException();
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }
}
