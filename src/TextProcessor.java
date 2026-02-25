import java.io.*;
import java.nio.file.*;

public class TextProcessor {
    public static String citesteFisier(String cale) throws IOException {
        return new String(Files.readAllBytes(Paths.get(cale)));
    }
    public static String eliminaPunctuatie(String text) {
        return text.replaceAll("[^a-zA-Z0-9\\s]", "");
    }
    public static String eliminaSpatiiMultiple(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }
    public static String filtreazaNumere(String text) {
        return text.replaceAll("\\b\\d+\\b", "");
    }
    public static void main(String[] args) {
        try {
            String text = citesteFisier("input.txt");
            System.out.println("=== TEXT ORIGINAL ===");
            System.out.println(text);

            String faraPunctuatie = eliminaPunctuatie(text);
            System.out.println("\n=== DUPA ELIMINARE PUNCTUATIE ===");
            System.out.println(faraPunctuatie);


            String faraNumere = filtreazaNumere(faraPunctuatie);
            System.out.println("\n=== DUPA FILTRARE NUMERE ===");
            System.out.println(faraNumere);

            String faraSpatii = eliminaSpatiiMultiple(faraNumere);
            System.out.println("\n=== DUPA ELIMINARE SPATII MULTIPLE ===");
            System.out.println(faraSpatii);

        } catch (IOException e) {
            System.out.println("Eroare la citirea fisierului: " + e.getMessage());
        }
    }


    }