package Hangman;

import Hangman.Enums.hangmanStages;
import System.UserInterface;
import System.Word;

import java.util.ArrayList;

public class Hangman {
    private static final UserInterface USER = new UserInterface();
    private static int errorsCounter = 0;
    private static int maxErrors = 6;

    public static void HangmanGame() {
        errorsCounter = 0;
        String secretWord = Word.getRandomWord();
        StringBuilder mask = new StringBuilder(String.valueOf('_').repeat(secretWord.length()));
        while (errorsCounter < maxErrors){
            ArrayList<Integer> positions= Word.findLetterPositions(secretWord, USER.takeLetter());
            if (positions.isEmpty()){
                USER.notifyLetterNotFound();
                errorsCounter++;
            }
            else {
                USER.notifyLetterFound();
                for (int i : positions){
                    mask.setCharAt(i, secretWord.charAt(i));
                }
                System.out.println(mask);
            }
            if(!mask.toString().contains("_")){
                break;
            }
        }
    }
}
