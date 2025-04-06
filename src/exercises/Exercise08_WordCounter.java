package exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Exercise 8: Word Counter
 * 
 * In this exercise, the frequency of words in a text needs to be counted.
 * This will use string operations, maps, and loops.
 * 
 * Implement a method that reads a text and counts the frequency of each word.
 */
public class Exercise08_WordCounter {
    
    /**
     * Counts the frequency of words in a text.
     * Case is ignored, meaning "Word" and "word" are counted as the same word.
     * Punctuation at the end of a word is removed.
     * 
     * @param text The text to analyze
     * @return A map with words as keys and their frequencies as values
     */
    public static Map<String, Integer> zaehleWoerter(String text) {
        // TODO: Implement the word counting
        // Note: Use a map to store the words and their frequencies
        // Split the text into words, remove punctuation, and count the occurrences
        return new HashMap<>(); // Replace this empty map with the correct result
    }
    
    public static void main(String[] args) {
        // Example text
        String text = "Der Hund läuft im Garten. Der Garten ist groß. Im Garten wachsen Blumen.";
        
        // Count words
        Map<String, Integer> wordFrequencies = zaehleWoerter(text);
        
        // Display frequencies
        System.out.println("Word frequencies in the text:");
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Example of a longer text
        text = "Java ist eine objektorientierte Programmiersprache. Java wird oft für Webanwendungen verwendet. " +
               "Programmiersprachen wie Java, Python und C++ sind sehr beliebt. Java ist vielseitig.";
        
        wordFrequencies = zaehleWoerter(text);
        
        System.out.println("\nWord frequencies in the second text:");
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}