package Hangman;

import System.*;

public class Hangman {
    private static final Display DISPLAY = new Display();
    public static void StartGame(){
        if(DISPLAY.UserStart()){
            HangmanGame();
        };
    }

    public static void HangmanGame(){
        Word.GenerateWord();
    }
}
