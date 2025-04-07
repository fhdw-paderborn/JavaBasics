package exercises;

/**
 * Exercise 11: Bottle Packing
 * 
 * In this exercise, you need to determine how many cartons are needed 
 * to pack a certain number of bottles and how many bottles will remain unpacked.
 * 
 * This will use division and modulo operations.
 * 
 * For example, if you have 25 bottles and each carton can hold 6 bottles,
 * you will need 4 cartons (which can hold 24 bottles in total) and 1 bottle will remain unpacked.
 */
public class Exercise08_BottlePacking {
    
    /**
     * Calculates the number of cartons needed to pack the bottles and the number of bottles that remain unpacked.
     * 
     * @param totalBottles The total number of bottles to pack
     * @param bottlesPerCarton The number of bottles that can fit in a single carton
     * @return An array of two integers: [numberOfCartonsNeeded, remainingBottles]
     * @throws ArithmeticException if bottlesPerCarton is zero
     */
    public static int[] calculateBottlePacking(int totalBottles, int bottlesPerCarton) {
        // Handle negative bottles by treating it as 0
        if (totalBottles < 0) {
            totalBottles = 0;
        }
        
        // Handle division by zero
        if (bottlesPerCarton == 0) {
            throw new ArithmeticException("Cannot pack bottles into cartons with zero capacity");
        }
        
        // Calculate number of cartons needed
        int cartonsNeeded = totalBottles / bottlesPerCarton;
        
        // Calculate remaining bottles
        int remainingBottles = totalBottles % bottlesPerCarton;
        
        return new int[] {cartonsNeeded, remainingBottles};
    }
    
    public static void main(String[] args) {
        // Example 1: 25 bottles with 6 bottles per carton
        int totalBottles = 25;
        int bottlesPerCarton = 6;
        
        int[] result = calculateBottlePacking(totalBottles, bottlesPerCarton);
        int cartonsNeeded = result[0];
        int remainingBottles = result[1];
        
        System.out.printf("For %d bottles with %d bottles per carton:%n", totalBottles, bottlesPerCarton);
        System.out.printf("- You need %d cartons%n", cartonsNeeded);
        System.out.printf("- %d bottles will remain unpacked%n", remainingBottles);
        
        // Example 2: 100 bottles with 12 bottles per carton
        totalBottles = 100;
        bottlesPerCarton = 12;
        
        result = calculateBottlePacking(totalBottles, bottlesPerCarton);
        cartonsNeeded = result[0];
        remainingBottles = result[1];
        
        System.out.printf("%nFor %d bottles with %d bottles per carton:%n", totalBottles, bottlesPerCarton);
        System.out.printf("- You need %d cartons%n", cartonsNeeded);
        System.out.printf("- %d bottles will remain unpacked%n", remainingBottles);
        
        // Example 3: 30 bottles with 5 bottles per carton
        totalBottles = 30;
        bottlesPerCarton = 5;
        
        result = calculateBottlePacking(totalBottles, bottlesPerCarton);
        cartonsNeeded = result[0];
        remainingBottles = result[1];
        
        System.out.printf("%nFor %d bottles with %d bottles per carton:%n", totalBottles, bottlesPerCarton);
        System.out.printf("- You need %d cartons%n", cartonsNeeded);
        System.out.printf("- %d bottles will remain unpacked%n", remainingBottles);
    }
}