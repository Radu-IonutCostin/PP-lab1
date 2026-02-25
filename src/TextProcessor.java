import java.io.*;
import java.nio.file.*;

public class TextProcessor {
    public static String citesteFisier(String cale) throws IOException {
        return new String(Files.readAllBytes(Paths.get(cale)));
    }
    public static String eliminaPunctuatie(String text) {
        return text.replaceAll("[^a-zA-Z0-9\\s]", "");
    }
}