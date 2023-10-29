

	public class Character {
	    public static void main(String[] args) {
	        String input = "this is java";
	        int count = Characters(input);
	        System.out.println("Output: " + count);
	    }

	    public static int Characters(String str) {
	         str = str.replaceAll("\\s", "");
            return str.length();
	    }
	}



