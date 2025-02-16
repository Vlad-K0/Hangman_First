package System;

import Hangman.Hangman;

import java.util.Scanner;

public class Display {
    public static final String START_MESSAGE = "Начать новую игру (да/нет)?";
    public static final String ERROR_INPUT_MESSAGE = "ошибка ввода";
    public static String YES = "да";
    public static String NO = "нет";
    public static final Scanner SCANNER = new Scanner(System.in);

    public boolean UserStart() {
        System.out.println(START_MESSAGE);

        String userInput = SCANNER.nextLine();

        while(!(userInput.toLowerCase().equals(YES) || userInput.toLowerCase().equals(NO))){
            System.out.println(ERROR_INPUT_MESSAGE);
            userInput = SCANNER.nextLine();
        }

        return userInput.equals(YES);
    }
}
