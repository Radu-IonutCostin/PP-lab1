import java.io.*;
import java.nio.file.*;

public class TextProcessor {
    public static String citesteFisier(String cale) throws IOException {
        return new String(Files.readAllBytes(Paths.get(cale)));
    }
}