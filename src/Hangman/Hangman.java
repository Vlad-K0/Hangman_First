package Hangman;

import Hangman.Enums.hangmanStages;
import System.UserInterface;
import System.Word;

import java.util.ArrayList;

public class Hangman {
    private static final UserInterface USER = new UserInterface();
    private static int errorsCounter = 0;
    private static final int maxErrors = 6;

    public static void HangmanGame() {
        errorsCounter = 0;
        printStage();
        String secretWord = Word.getRandomWord();
        StringBuilder mask = new StringBuilder(String.valueOf('_').repeat(secretWord.length()));
        while (errorsCounter < maxErrors) {
            System.out.println("Слово: " + mask);
            System.out.println("Ошибки " + "(" + errorsCounter + "): " + USER.getErrors());
            char userInput = USER.takeLetter();
            ArrayList<Integer> positions = Word.findLetterPositions(secretWord, userInput);
            if (positions.isEmpty()) {
                USER.notifyLetterNotFound();
                USER.getErrors().add(userInput);
                errorsCounter++;
            } else {
                USER.notifyLetterFound();
                USER.getUserRight().add(userInput);
                for (int i : positions) {
                    mask.setCharAt(i, secretWord.charAt(i));
                }
                System.out.println(mask);
            }
            if (!mask.toString().contains("_")) {
                USER.win();
                break;
            }
            printStage();
        }
        if (errorsCounter == maxErrors){
            USER.lose(secretWord);
        }
    }

    private static void printStage() {
        hangmanStages[] stages = hangmanStages.values();
        System.out.println(stages[errorsCounter].getState());
    }

}
