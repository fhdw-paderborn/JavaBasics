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
public class Exercise10_WordCounter {
    
    /**
     * Counts the frequency of words in a text.
     * Case is ignored, meaning "Word" and "word" are counted as the same word.
     * Punctuation at the end of a word is removed.
     * 
     * @param text The text to analyze
     * @return A map with words as keys and their frequencies as values
     */
    public static Map<String, Integer> zaehleWoerter(String text) {
        Map<String, Integer> wordFrequencies = new HashMap<>();
        
        // If text is empty, return empty map
        if (text == null || text.isEmpty()) {
            return wordFrequencies;
        }
        
        // Split the text into words (by whitespace)
        String[] words = text.split("\\s+");
        
        // Process each word
        for (String word : words) {
            // Skip empty words
            if (word.isEmpty()) {
                continue;
            }
            
            // Remove punctuation at the end of the word
            word = word.replaceAll("[.,!?:;]$", "");
            
            // Convert to lowercase
            word = word.toLowerCase();
            
            // Update the word count in the map
            wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
        }
        
        return wordFrequencies;
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