import javax.sound.sampled.SourceDataLine;

public class Game {
    public static void main(String[] args) {
        Code code = new Code();
        Cheat cheat = new Cheat();
        boolean wonGame = false;

        //cheat mode
        System.out.println("Cheat mode: " + code.getCode());

    while (!wonGame){
        String guess = cheat.Guesses();
            String feedback = getFeedback(guess, code.getCode());
            
            System.out.println("Feedback: " + feedback);

            if (feedback.equals("hhhh")) {
                System.out.println("Congratulations! You guessed the secret code.");
                wonGame = true;
            }
    }
}
private static String getFeedback(String guess, String secretCode) {
    // Implement logic to provide feedback (hits and partials)
    // ...

    // For demonstration purposes, return a dummy feedback
    return "pppp";
}
}
