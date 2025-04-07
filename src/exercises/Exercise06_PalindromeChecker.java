package exercises;

/**
 * Exercise 6: Palindrome Checker
 * 
 * In this exercise, we need to check if a text is a palindrome.
 * A palindrome is a word that reads the same forward and backward.
 * In this palindrome checker, capitalization and spaces are ignored.
 * 
 * Examples of palindromes:
 * - "Anna"
 * - "Otto"
 * - "Reliefpfeiler"
 */
public class Exercise06_PalindromeChecker {
    
    /**
     * Checks if a text is a palindrome.
     * Capitalization and spaces are ignored.
     * 
     * @param text The text to check
     * @return true if the text is a palindrome, otherwise false
     */
    public static boolean isPalindrome(String text) {
        // Handle edge cases
        if (text == null) {
            return false;
        }
        
        // Convert to lowercase and remove spaces and punctuation
        String cleanText = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Check if the text is the same forward and backward
        int length = cleanText.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanText.charAt(i) != cleanText.charAt(length - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        // Examples of palindromes and non-palindromes
        String[] texts = {
            "Anna",
            "Otto",
            "Reliefpfeiler",
            "Hallo Welt",
            "Java ist cool"
        };
        
        for (String text : texts) {
            if (isPalindrome(text)) {
                System.out.println("\"" + text + "\" is a palindrome.");
            } else {
                System.out.println("\"" + text + "\" is not a palindrome.");
            }
        }
    }
}