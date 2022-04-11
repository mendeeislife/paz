import acm.program.*;

public class Largest2Integers extends ConsoleProgram {

	public void run() {
		println("This program finds the 2 largest integers in a given list.");
		println();
		println("Enter values, one per line, using a '0' to signal");
		println("the end of the list.");

		int n2 = 1;
		int n3 = 1;

		while (true) {
			int n1 = readInt(" ? ");
			if (n1 > n3) {
				n2 = n3;
				n3 = n1;
			} else {
				if (n1 > n2) {
					n2 = n1;
				}
			}
			if (n1 == SENTINEL)
				break;
		}
		println("The largest integer is " + n3 + ".");
		println("The second largest integer is " + n2 + ".");
	}

	private static final int SENTINEL = 0;
}