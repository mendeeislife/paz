import acm.program.*;

public class AverageList extends ConsoleProgram {

	public void run() {
		println("This program averages a list of integers.");
		println();
		println("Enter values, one per line, using " + SENTINEL + " to singal the end of the list.");
		println();
		int total = 0;
		int count = 0;
		for (count = 0; total != -1; count++) {
			int value = readInt(" ? ");
			if (value == SENTINEL)
				break;
			total += value;
		}
		println("The average is " + (total / count));
	}

	private static final int SENTINEL = -1;
}