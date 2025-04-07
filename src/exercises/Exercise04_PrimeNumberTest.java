package exercises;

/**
 * Exercise 4: Prime Number Test
 * 
 * In this exercise, we need to check if a number is a prime number.
 * This will use loops and control structures.
 * 
 * A prime number is a natural number greater than 1 that is only divisible by 1 and itself.
 */
public class Exercise04_PrimeNumberTest {
    
    /**
     * Checks if a number is a prime number.
     * 
     * @param number The number to check
     * @return true if the number is a prime number, otherwise false
     */
    public static boolean isPrimeNumber(int number) {
        // Handle edge cases
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        
        // 2 is the only even prime number
        if (number == 2) {
            return true;
        }
        
        // Even numbers greater than 2 are not prime
        if (number % 2 == 0) {
            return false;
        }
        
        // Check for divisibility by odd numbers from 3 to the square root of the number
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false; // Number is divisible by i, so it's not a prime
            }
        }
        
        // If we get here, the number is prime
        return true;
    }
    
    public static void main(String[] args) {
        // Examples of prime and non-prime numbers
        int[] numbers = {2, 3, 4, 5, 6, 7, 11, 13, 15, 17, 20, 23, 29, 97, 100};
        
        for (int number : numbers) {
            if (isPrimeNumber(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}