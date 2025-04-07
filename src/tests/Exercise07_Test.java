package tests;

import org.junit.Test;

import exercises.Exercise07_NumberSystemConverter;

import static org.junit.Assert.*;

public class Exercise07_Test {
    
    @Test
    public void testDezimalZuBinaer() {
        // Test decimal to binary
        assertEquals("0", Exercise07_NumberSystemConverter.decimal2Binary(0));
        assertEquals("1", Exercise07_NumberSystemConverter.decimal2Binary(1));
        assertEquals("1010", Exercise07_NumberSystemConverter.decimal2Binary(10));
        assertEquals("101010", Exercise07_NumberSystemConverter.decimal2Binary(42));
        assertEquals("11111111", Exercise07_NumberSystemConverter.decimal2Binary(255));
        assertEquals("10000000000", Exercise07_NumberSystemConverter.decimal2Binary(1024));
    }
    
    @Test
    public void testDezimalZuOktal() {
        // Test decimal to octal
        assertEquals("0", Exercise07_NumberSystemConverter.decimal2octal(0));
        assertEquals("1", Exercise07_NumberSystemConverter.decimal2octal(1));
        assertEquals("12", Exercise07_NumberSystemConverter.decimal2octal(10));
        assertEquals("52", Exercise07_NumberSystemConverter.decimal2octal(42));
        assertEquals("377", Exercise07_NumberSystemConverter.decimal2octal(255));
        assertEquals("2000", Exercise07_NumberSystemConverter.decimal2octal(1024));
    }
    
    @Test
    public void testDezimalZuHexadezimal() {
        // Test decimal to hexadecimal
        assertEquals("0", Exercise07_NumberSystemConverter.decimal2hex(0));
        assertEquals("1", Exercise07_NumberSystemConverter.decimal2hex(1));
        assertEquals("A", Exercise07_NumberSystemConverter.decimal2hex(10));
        assertEquals("2A", Exercise07_NumberSystemConverter.decimal2hex(42));
        assertEquals("FF", Exercise07_NumberSystemConverter.decimal2hex(255));
        assertEquals("400", Exercise07_NumberSystemConverter.decimal2hex(1024));
        assertEquals("1F4", Exercise07_NumberSystemConverter.decimal2hex(500));
    }
    
    @Test
    public void testBinaerZuDezimal() {
        // Test binary to decimal
        assertEquals(0, Exercise07_NumberSystemConverter.binary2decimal("0"));
        assertEquals(1, Exercise07_NumberSystemConverter.binary2decimal("1"));
        assertEquals(10, Exercise07_NumberSystemConverter.binary2decimal("1010"));
        assertEquals(42, Exercise07_NumberSystemConverter.binary2decimal("101010"));
        assertEquals(255, Exercise07_NumberSystemConverter.binary2decimal("11111111"));
        assertEquals(1024, Exercise07_NumberSystemConverter.binary2decimal("10000000000"));
    }
    
    @Test
    public void testSpecialCases() {
        // Test special cases like negative numbers and limits
        assertEquals("-101", Exercise07_NumberSystemConverter.decimal2Binary(-5));
        assertEquals("-12", Exercise07_NumberSystemConverter.decimal2octal(-10));
        assertEquals("-A", Exercise07_NumberSystemConverter.decimal2hex(-10));
        assertEquals(-42, Exercise07_NumberSystemConverter.binary2decimal("-101010"));
    }
    
    @Test
    public void testLargeNumbers() {
        // Test large numbers
        assertEquals("1111111111111111111111111111111", Exercise07_NumberSystemConverter.decimal2Binary(Integer.MAX_VALUE));
        assertEquals("17777777777", Exercise07_NumberSystemConverter.decimal2octal(Integer.MAX_VALUE));
        assertEquals("7FFFFFFF", Exercise07_NumberSystemConverter.decimal2hex(Integer.MAX_VALUE));
    }
}