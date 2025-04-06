package tests;

import org.junit.Test;

import exercises.Exercise10_PrintfTableFormatting;

import static org.junit.Assert.*;

public class Test_Exercise10 {
    
    @Test
    public void testTableHeader() {
        String header = Exercise10_PrintfTableFormatting.createTableHeader();
        
        // Check that the header contains column names
        assertTrue("Header should contain 'ID' column", header.contains("ID"));
        assertTrue("Header should contain 'Name' column", header.contains("Name"));
        assertTrue("Header should contain 'Price' column", header.contains("Price"));
        assertTrue("Header should contain 'Quantity' column", header.contains("Quantity"));
        
        // Check that the header has the expected format (one line with proper separation)
        assertEquals("Header should be a single line", 1, header.split("\n").length);
    }
    
    @Test
    public void testTableRow() {
        // Test with various inputs
        String row1 = Exercise10_PrintfTableFormatting.createTableRow(1, "Laptop", 999.99, 5);
        String row2 = Exercise10_PrintfTableFormatting.createTableRow(42, "Mouse", 19.95, 20);
        String row3 = Exercise10_PrintfTableFormatting.createTableRow(100, "USB Cable", 5.50, 100);
        
        // Check that rows contain the expected data
        assertTrue("Row should contain ID", row1.contains("1"));
        assertTrue("Row should contain product name", row1.contains("Laptop"));
        assertTrue("Row should contain price", row1.contains("999.99"));
        assertTrue("Row should contain quantity", row1.contains("5"));
        
        assertTrue("Row should contain ID", row2.contains("42"));
        assertTrue("Row should contain product name", row2.contains("Mouse"));
        
        assertTrue("Row should contain ID", row3.contains("100"));
        assertTrue("Row should contain product name", row3.contains("USB Cable"));
        
        // Check that different rows have the same length for proper alignment
        assertEquals("Rows should have consistent length for alignment", 
                     row1.length(), row2.length());
        assertEquals("Rows should have consistent length for alignment", 
                     row2.length(), row3.length());
    }
    
    @Test
    public void testCompleteTable() {
        String table = Exercise10_PrintfTableFormatting.createProductTable();
        
        // Split the table into lines
        String[] lines = table.split("\n");
        
        // Check that we have a header and at least 5 product rows
        assertTrue("Table should have at least 6 lines (header + 5 products)", 
                  lines.length >= 6);
        
        // Check that all lines have the same length for alignment
        int headerLength = lines[0].length();
        for (int i = 1; i < lines.length; i++) {
            assertEquals("All table rows should have the same length for proper alignment",
                        headerLength, lines[i].length());
        }
        
        // Check that table contains expected formatting elements
        assertTrue("Table should have proper column alignment", 
                  table.contains("|") || table.matches(".*\\s{2,}.*"));
    }
    
    @Test
    public void testPriceFormatting() {
        // Check that prices are formatted with currency symbols
        String row = Exercise10_PrintfTableFormatting.createTableRow(1, "Test", 99.99, 1);
        
        // Price should be formatted with 2 decimal places
        assertTrue("Price should be formatted with 2 decimal places", 
                  row.contains("99.99") || row.contains("$99.99"));
        
        // Test with a whole number price
        row = Exercise10_PrintfTableFormatting.createTableRow(2, "Test2", 100.00, 1);
        assertTrue("Whole number prices should still show 2 decimal places", 
                  row.contains("100.00") || row.contains("$100.00"));
    }
    
    @Test
    public void testNegativeValues() {
        // Test with negative price and quantity
        String row = Exercise10_PrintfTableFormatting.createTableRow(1, "Test", -10.50, -5);
        
        // Negative values should be properly formatted
        assertTrue("Negative prices should be formatted correctly", 
                  row.contains("-10.50") || row.contains("($10.50)") || row.contains("-$10.50"));
        assertTrue("Negative quantities should be formatted correctly",
                  row.contains("-5"));
    }
}