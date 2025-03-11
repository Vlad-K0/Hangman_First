package System;

import java.util.Scanner;
import java.util.TreeSet;

public class UserInterface {
    public static final String START_MESSAGE = "Начать новую игру (да/нет)?";
    public static final String ERROR_INPUT_MESSAGE = "ошибка ввода";
    public static final String LETTER_FOUND = "Верно! Буква найдена";
    public static final String LETTER_NOT_FOUND = "Неверно! такой буквы нет";
    public static final String USER_WIN = "Вы выиграли!";
    public static final String USER_LOSE = "Вы проиграли!";
    public static final String RUSSIAN_ALPHABET = "[А-Яа-яËё]";

    public static final Scanner SCANNER = new Scanner(System.in);
    public static TreeSet<Character> userErrors = new TreeSet<>();
    public static TreeSet<Character> userRight = new TreeSet<>();
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
        System.out.println(LETTER_NOT_FOUND);
    }

    public char takeLetter() {
        String letter = SCANNER.nextLine();
        while (!letter.matches(RUSSIAN_ALPHABET) || userErrors.contains(letter.charAt(0)) || userRight.contains(letter.charAt(0)) || letter.length() > 1) {
            System.out.println(ERROR_INPUT_MESSAGE);
            letter = SCANNER.nextLine();
        }
        return letter.charAt(0);
    }

    public TreeSet<Character> getErrors() {
        return userErrors;
    }

    public TreeSet<Character> getUserRight() {
        return userRight;
    }

    public void win() {
        System.out.println(USER_WIN);
    }

    public void lose(String secretWord) {
        System.out.println(USER_LOSE);
        System.out.println("Загаданное слово: " + secretWord);
    }
}
