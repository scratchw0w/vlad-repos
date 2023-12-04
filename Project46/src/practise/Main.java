package practise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
//        Arrays.stream(args)
//                .forEach(System.out::println);
        Path toFile = Path.of("C:\\Vladyslav\\Java\\vlad-repos\\Project46\\text.txt");
        boolean exists = Files.exists(toFile);
        System.out.println(exists);
        try {
//            List<String> lines = Files.readAllLines(toFile);
            String line = String.join(", ", Files.readAllLines(toFile));
            System.out.println(line);
        }
        catch (IOException ioException){
            System.out.println("Exception catched");
        }
        Path dirPath = Path.of("C:\\Vladyslav\\Java\\vlad-repos\\Project46\\text");
        Files.createDirectory(dirPath);
        boolean dirExists = Files.exists(dirPath);
        System.out.println(dirExists);
    }
}