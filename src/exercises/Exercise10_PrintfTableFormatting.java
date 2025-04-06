package exercises;

/**
 * Exercise 10: Printf Table Formatting
 * 
 * This exercise demonstrates the use of printf for formatted output in Java.
 * You will learn about format specifiers, flags, width, precision, and other
 * formatting options to create well-aligned tables in the console.
 * 
 * Format specifiers include:
 * %d - integer
 * %f - floating point
 * %s - string
 * %c - character
 * %b - boolean
 * %x - hexadecimal
 * %o - octal
 * 
 * Common flags:
 * - (minus) - left justify
 * + (plus) - show sign for numbers
 * 0 (zero) - pad with zeros
 * , (comma) - use locale-specific grouping separators
 * ( - enclose negative numbers in parentheses
 * # - use alternate format
 */
public class Exercise10_PrintfTableFormatting {
    
    /**
     * Creates a formatted table header with column titles.
     * 
     * @return The formatted table header string
     */
    public static String createTableHeader() {
        // TODO: Create a table header with columns for ID, Name, Price, and Quantity
        // Use printf with appropriate format specifiers and width settings
        return ""; // Replace this with the properly formatted header
    }
    
    /**
     * Creates a formatted table row for a product entry.
     * 
     * @param id The product ID (integer)
     * @param name The product name (string)
     * @param price The product price (double)
     * @param quantity The product quantity (integer)
     * @return The formatted table row string
     */
    public static String createTableRow(int id, String name, double price, int quantity) {
        // TODO: Format the data into a table row
        // Use printf with appropriate format specifiers, width settings, and alignment
        return ""; // Replace this with the properly formatted row
    }
    
    /**
     * Creates a complete product table with header and multiple rows.
     * Each row should be properly aligned with the header.
     * 
     * @return The complete formatted table as a string
     */
    public static String createProductTable() {
        // TODO: Create a complete table with a header and at least 5 product rows
        // Use the createTableHeader and createTableRow methods
        return ""; // Replace this with the complete table
    }
    
    public static void main(String[] args) {
        // Print the complete product table to the console
        System.out.println("Product Inventory Table:");
        System.out.println(createProductTable());
        
        // Demonstrate various printf formatting options
        System.out.println("\nDemonstration of printf format specifiers:");
        
        // Integer formatting
        int num = 42;
        System.out.printf("Integer formatting: %d, %6d, %-6d, %06d%n", num, num, num, num);
        
        // Floating-point formatting
        double pi = Math.PI;
        System.out.printf("Float formatting: %f, %.2f, %10.4f, %-10.2f%n", pi, pi, pi, pi);
        
        // String formatting
        String text = "Java";
        System.out.printf("String formatting: %s, %10s, %-10s%n", text, text, text);
        
        // Multiple arguments
        System.out.printf("Mixed formatting: %d %s costs $%.2f%n", 5, "apples", 2.50 * 5);
        
        // Argument indexing
        System.out.printf("Argument indexing: %1$s, %1$s, %2$d, %3$.2f%n", "repeat", 10, 3.14);
    }
}