import acm.program.*;
import acm.util.*;

public class CoinFlip extends ConsoleProgram {

	public void run() {
		int n = 3; //Number of consecutive heads.
		int heads = 0;
		int count = 0;
		
		//Loops until 'n' number of 'heads' is reached.
		while (heads < n) {
			count++;
			if (coinFlip()) {
				println("Heads!");
				heads += 1;
			} else {
				println("Tails!");
				heads = 0;
			}
		}
		
		//Displays final results.
		println("It took " + count + " flips to get " + n + " consecutive heads.");
	}
	
	//Boolean method coinFlip uses RandomGenerator to decide 'true' or 'false' && true = heads, false = tails.
	private boolean coinFlip() {
		return rgen.nextBoolean();
	}
	
	//Generates a random number.
	private RandomGenerator rgen = RandomGenerator.getInstance();
}