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
        // Handle special case for 0
        if (decimal == 0) {
            return "0";
        }
        
        // Handle negative numbers
        boolean isNegative = decimal < 0;
        if (isNegative) {
            decimal = -decimal;
        }
        
        StringBuilder binary = new StringBuilder();
        
        // Convert decimal to binary
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        
        // Add negative sign if needed
        if (isNegative) {
            binary.insert(0, "-");
        }
        
        return binary.toString();
    }
    
    /**
     * Converts a decimal number to an octal number (as a string).
     * 
     * @param decimal The decimal number
     * @return The octal number as a string
     */
    public static String decimal2octal(int decimal) {
        // Handle special case for 0
        if (decimal == 0) {
            return "0";
        }
        
        // Handle negative numbers
        boolean isNegative = decimal < 0;
        if (isNegative) {
            decimal = -decimal;
        }
        
        StringBuilder octal = new StringBuilder();
        
        // Convert decimal to octal
        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal /= 8;
        }
        
        // Add negative sign if needed
        if (isNegative) {
            octal.insert(0, "-");
        }
        
        return octal.toString();
    }
    
    /**
     * Converts a decimal number to a hexadecimal number (as a string).
     * 
     * @param decimal The decimal number
     * @return The hexadecimal number as a string
     */
    public static String decimal2hex(int decimal) {
        // Handle special case for 0
        if (decimal == 0) {
            return "0";
        }
        
        // Handle negative numbers
        boolean isNegative = decimal < 0;
        if (isNegative) {
            decimal = -decimal;
        }
        
        StringBuilder hex = new StringBuilder();
        
        // Convert decimal to hexadecimal
        while (decimal > 0) {
            int remainder = decimal % 16;
            
            // Convert values 10-15 to A-F
            if (remainder < 10) {
                hex.insert(0, remainder);
            } else {
                hex.insert(0, (char) ('A' + remainder - 10));
            }
            
            decimal /= 16;
        }
        
        // Add negative sign if needed
        if (isNegative) {
            hex.insert(0, "-");
        }
        
        return hex.toString();
    }
    
    /**
     * Converts a binary number (as a string) to a decimal number.
     * 
     * @param binary The binary number as a string
     * @return The decimal number
     */
    public static int binary2decimal(String binary) {
        // Handle special case for null or empty string
        if (binary == null || binary.isEmpty()) {
            return 0;
        }
        
        // Handle negative numbers
        boolean isNegative = binary.startsWith("-");
        if (isNegative) {
            binary = binary.substring(1);
        }
        
        int decimal = 0;
        
        // Convert binary to decimal
        for (int i = 0; i < binary.length(); i++) {
            char digit = binary.charAt(i);
            
            if (digit == '1') {
                decimal = decimal * 2 + 1;
            } else if (digit == '0') {
                decimal = decimal * 2;
            } else {
                throw new IllegalArgumentException("Invalid binary digit: " + digit);
            }
        }
        
        // Apply negative sign if needed
        if (isNegative) {
            decimal = -decimal;
        }
        
        return decimal;
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