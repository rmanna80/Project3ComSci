import java.util.Scanner;

public class Cheat {
    private String lastGuess;

    public String Guesses(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetre you guess: ");
        lastGuess = scanner.nextLine().toLowerCase();
        return lastGuess;
    }

    public String getLastGuess(){
        return lastGuess;
    }
}