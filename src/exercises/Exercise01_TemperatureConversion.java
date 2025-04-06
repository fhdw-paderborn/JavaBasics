package exercises;

/**
 * Exercise 1: Temperature Conversion
 * 
 * This exercise is about converting temperatures between
 * Celsius and Fahrenheit using arithmetic operators.
 * 
 * Formula: Fahrenheit = Celsius * 9/5 + 32
 */
public class Exercise01_TemperatureConversion {
    
    /**
     * This method converts a temperature from Celsius to Fahrenheit.
     * 
     * @param celsius The temperature in Celsius
     * @return The converted temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        // TODO: Implement the conversion from Celsius to Fahrenheit
        // Use the formula: Fahrenheit = Celsius * 9/5 + 32
        return 0.0; // Replace this value with the correct calculation
    }
    
    public static void main(String[] args) {
        // Test case 1: Water freezes at 0°C
        double celsius = 0.0;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C equals " + fahrenheit + "°F");
        
        // Test case 2: Water boils at 100°C
        celsius = 100.0;
        fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C equals " + fahrenheit + "°F");
        
        // Test case 3: Room temperature (22°C)
        celsius = 22.0;
        fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C equals " + fahrenheit + "°F");
    }
}