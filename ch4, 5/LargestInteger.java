import acm.program.*;

public class LargestInteger extends ConsoleProgram {

	private static final int SENTINEL = 0;

	public void run() {
		println("This program finds the largest integer in a list.");
		println("Enter values, one per line, using a '0' to signal");
		println("the end of the list.");

		int n2 = 1;

		while (true) {
			int n1 = readInt(" ? ");
			if (n1 >= n2) {
				n2 = n1;
			}
			if (n1 == SENTINEL)
				break;
		}
		println("The largest number is " + n2 + ".");
	}
}