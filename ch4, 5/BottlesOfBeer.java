import acm.program.*;

public class BottlesOfBeer extends ConsoleProgram {

	public void run() {
		int bottle = readInt("Number of bottles : ");
		for (int i = bottle; i > 0; i--) {
			println(i + " bottles of beer on the wall.");
			println(i + " bottles of beer.");
			println("You take one down, pass it around.");
			println(i - 1 + " bottles of beer on the wall.");
			println();
		}
	}
}