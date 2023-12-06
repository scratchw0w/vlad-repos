package practise;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        getUserNameById("bas").ifPresent(name -> {
            System.out.println(name);
            System.out.println(name.toUpperCase());
        });
        String name = getUserNameById("0").orElse(" ");
        System.out.println(name.length());
    }

    private static Optional<String> getUserNameById(String id) {
        if (id.equals("0")) {
            return Optional.empty();
        } else {
            return Optional.of("Dmytro");
        }
    }
}
