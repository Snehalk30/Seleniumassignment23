import java.util.Scanner;

public class PositiveNegativeNumber {
	
	public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();

	       
	        if (number > 0) {
	            
	            System.out.println("Number is Positive");
	        } else if (number < 0) {
	            
	            System.out.println("Number is Negative");
	        } else {
	           
	            System.out.println("Number is Zero");
	        }

	        
	    }
	}



