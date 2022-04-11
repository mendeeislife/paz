import acm.program.*;

public class FibonacciSequence extends ConsoleProgram {

	public void run() {
		println("This program will list Fibonacci Sequences.");
		println();
		int n = readInt("Please enter number of sequences: ");
		println();
		int f1 = 0;
		int f2 = 1;
		println("F0 = 0");
		println("F1 = 1");
		for (int i = 2; i <= (n - 1); i++) {
			int f = f1 + f2;
			println("F" + i + " = " + f);
			f1 = f2;
			f2 = f;
		}
	}
}