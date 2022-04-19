import acm.program.*;
import acm.util.*;

public class RandomCard extends ConsoleProgram {
	
	public void run() {
		println("This program displays a randomly chosen card.");
		println(randomRank() + " of " + getSuit());
	}

	//Method randomRank uses switch statement to return a value of 'A'
	private String randomRank() {
		int card = rgen.nextInt(1, 13);
		switch (card) {
			case 1: return "Ace";
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			default: return ("" + card);
		}
	}	

	//Method randomSuit uses switch statement to return one of four suits.
	private String randomSuit() {
		int suit = rgen.nextInt(1, 4);
		switch (suit) {
			case 1: return "Spades";
			case 2: return "Hearts";
			case 3: return "Clubs";
			default: return "Diamonds";
		}
	}

	//Initializes instance variable for random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
}