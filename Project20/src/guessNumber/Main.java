package guessNumber;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        boolean inGame = true;
        while (inGame) {
            game.play();
            System.out.println("Хотите продолжить игру?(yes/no)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Спасибо за игру!");
                inGame = false;
            }
        }
    }
}
