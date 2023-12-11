
	import java.util.Scanner;

	public class Palindrome {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        boolean isPalindrome = isPalindrome(input);

	        if (isPalindrome) {
	            System.out.println("Output: true ");
	        } else {
	            System.out.println("Output: false ");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        
	       str = str.replaceAll("\\s", "").toLowerCase();

	         String reversed = new StringBuilder(str).reverse().toString();

	        return str.equals(reversed);
	    }
	}



