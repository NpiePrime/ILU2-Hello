package ilu2;

public class Welcome {
	public static String welcome(String input) {
		StringBuilder output = new StringBuilder();
		output.append("Hello, " + firstLetterUpperCase(input));
		return output.toString();
		
	}
	private static String firstLetterUpperCase(String input) {
		input = input.substring(0, 1).toUpperCase() + input.substring(1);
		return input;
	}
	
}
