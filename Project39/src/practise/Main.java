package practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(3);
        numList.add(1);
        numList.add(5);
        List<Integer> updatedList = numList.stream()
                .filter(integer -> integer < 4)    // Промежуточная(intemediate)
                .map(integer -> integer + 1)
                .toList(); //(Terminal)
        System.out.println(updatedList);
    }
}
