package System;

import Hangman.Hangman;

import java.util.Scanner;

public class Display {
    public static final String START_MESSAGE = "Начать новую игру (да/нет)?";
    public static String YES = "да";
    public static String NO = "нет";
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void UserStart() {
        System.out.println(START_MESSAGE);

        if (SCANNER.nextLine().toLowerCase().equals(YES)) {
            Hangman.HangmanGame();
        }

    }
}
