package System;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;


public class Word {
    public static final String PATH_DICTIONARY = "./resource/Dictionary11.txt";

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
}
