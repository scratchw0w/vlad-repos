package guessNumber;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final static int ATTEMPTS_NUMBER = 10;
    private final static int MIN_SECRET_NUM = 0;
    private final static int MAX_SECRET_NUM = 101;
    private final int secretNumber;
    private int attempts;
    private boolean isWinner;

    public Game() {
        Random randNum = new Random();
        this.secretNumber = randNum.nextInt(MIN_SECRET_NUM, MAX_SECRET_NUM);
        this.attempts = ATTEMPTS_NUMBER;
        this.isWinner = false;
    }

    private void printResult(boolean isWinner){
        if(isWinner){
            System.out.println("Поздравляю, вы угадали число");
        }
        else{
            System.out.println("К сожалению, вы не угадали число.");
        }
    }

    public void play() {
        while (attempts != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число от 1 до 100 -->");
            int playerNumber = scanner.nextInt();
            if (playerNumber == this.secretNumber) {
                this.isWinner = true;
                break;
            } else if (playerNumber > this.secretNumber) {
                System.out.println("Ваше число больше, чем загаданное");
                this.attempts--;
            } else {
                System.out.println("Ваше число меньше, чем загаданное");
                this.attempts--;
            }
        }
        printResult(this.isWinner);
    }
}
