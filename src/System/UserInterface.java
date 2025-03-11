package System;

import java.util.Scanner;

public class UserInterface {
    public static final String START_MESSAGE = "Начать новую игру (да/нет)?";
    public static final String ERROR_INPUT_MESSAGE = "ошибка ввода";
    public static final String LETTER_FOUND = "Верно! Буква найдена";
    public static final String LETTER_NOT_FOUND = "Неверно! такой буквы нет";
    public static final Scanner SCANNER = new Scanner(System.in);
    public static String YES = "да";
    public static String NO = "нет";

    public boolean start() {
        System.out.println(START_MESSAGE);

        String userInput = SCANNER.nextLine();

        while (!(userInput.toLowerCase().equals(YES) || userInput.toLowerCase().equals(NO))) {
            System.out.println(ERROR_INPUT_MESSAGE);
            userInput = SCANNER.nextLine();
        }

        return userInput.equals(YES);
    }

    public void notifyLetterFound() {
        System.out.println(LETTER_FOUND);
    }

    public void notifyLetterNotFound() {
        System.out.println(LETTER_FOUND);
    }

    public char takeLetter() {
        String letter = SCANNER.nextLine();
        return letter.charAt(0);
    }
}
