package System;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Word {
    public static final String PATH_DICTIONARY = "./resource/Dictionary.txt";

    public static String getRandomWord() {
        try {
            List<String> lines = Files.readAllLines(Path.of(PATH_DICTIONARY));

            Random random = new Random();
            return lines.get(random.nextInt(lines.size()));

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static ArrayList<Integer> findLetterPositions(String word, char letter) {
        ArrayList<Integer> positions = new ArrayList<>(word.length());

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                positions.add(i);
            }
        }

        return positions;
    }
}
