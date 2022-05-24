import acm.program.*;

public class Consonants extends ConsoleProgram {
	
	public void run() {
		println("This program displays a list of all UPPERCASE consonants.");
		println();
		// Loops for all letters from A to Z.
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			// Prints character if it is a consonant.
			if (isEnglishConsonant(ch)) {
				println(ch);
			}
		}
	}
	
	/**
	 * Determines if character is a consonant.
	 */
	private boolean isEnglishConsonant(char ch) {
		switch (Character.toLowerCase(ch)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				return false;
			default:
				return true;
		}
	}
}