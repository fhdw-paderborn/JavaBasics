package exercises;

/**
 * Exercise 9: Number System Converter
 * 
 * In this exercise, a number needs to be converted between different number systems.
 * This will use string operations, loops, and bit operations.
 * 
 * Implement methods to convert between decimal, binary, octal, and hexadecimal.
 */
public class Exercise07_NumberSystemConverter {
    
    /**
     * Converts a decimal number to a binary number (as a string).
     * 
     * @param decimal The decimal number
     * @return The binary number as a string
     */
    public static String decimal2Binary(int decimal) {
        // TODO: Implement the conversion from decimal to binary
        // Note: Use bit operations or the modulo operator
        return ""; // Replace this value with the correct calculation
    }
    
    /**
     * Converts a decimal number to an octal number (as a string).
     * 
     * @param decimal The decimal number
     * @return The octal number as a string
     */
    public static String decimal2octal(int decimal) {
        // TODO: Implement the conversion from decimal to octal
        // Note: Use bit operations or the modulo operator
        return ""; // Replace this value with the correct calculation
    }
    
    /**
     * Converts a decimal number to a hexadecimal number (as a string).
     * 
     * @param decimal The decimal number
     * @return The hexadecimal number as a string
     */
    public static String decimal2hex(int decimal) {
        // TODO: Implement the conversion from decimal to hexadecimal
        // Note: Use bit operations or the modulo operator
        // Remember that hexadecimal digits above 9 are represented as A to F
        return ""; // Replace this value with the correct calculation
    }
    
    /**
     * Converts a binary number (as a string) to a decimal number.
     * 
     * @param binary The binary number as a string
     * @return The decimal number
     */
    public static int binary2decimal(String binary) {
        // TODO: Implement the conversion from binary to decimal
        // Note: Go through the string and calculate the value of each position
        return 0; // Replace this value with the correct calculation
    }
    
    public static void main(String[] args) {
        // Examples of conversions
        int decimal = 42;
        
        System.out.println(decimal + " (decimal) = " + decimal2Binary(decimal) + " (binary)");
        System.out.println(decimal + " (decimal) = " + decimal2octal(decimal) + " (octal)");
        System.out.println(decimal + " (decimal) = " + decimal2hex(decimal) + " (hexadecimal)");
        
        String binary = "101010";
        System.out.println(binary + " (binary) = " + binary2decimal(binary) + " (decimal)");
        
        // More examples
        decimal = 255;
        System.out.println("\n" + decimal + " (decimal) = " + decimal2Binary(decimal) + " (binary)");
        System.out.println(decimal + " (decimal) = " + decimal2octal(decimal) + " (octal)");
        System.out.println(decimal + " (decimal) = " + decimal2hex(decimal) + " (hexadecimal)");
        
        binary = "11111111";
        System.out.println(binary + " (binary) = " + binary2decimal(binary) + " (decimal)");
    }
}