import Hangman.Hangman;
import System.UserInterface;

public class Main {
    private static final UserInterface USER = new UserInterface();

    public static void main(String... args){
        while (USER.start()){
            Hangman.HangmanGame();
        }
    }
}