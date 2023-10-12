

	import java.util.Scanner;

	public class ConverterTempreture {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter temperature in Celsius: ");
	        double celsius = scanner.nextDouble();
	        scanner.close();

	        // Convert Celsius to Fahrenheit using the formula: °F = 1.8°C + 32
	        double fahrenheit = 1.8 * celsius + 32;

	        // Convert Celsius to Kelvin using the formula: K = °C + 273
	        double kelvin = celsius + 273;

	        // Display the results
	        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
	        System.out.println(celsius + " Celsius = " + kelvin + " Kelvin");
	    }
	}



