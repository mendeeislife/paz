import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	public void run() {
		int n = readInt("Please enter the ending Fibonacci Sequence: ");
		println("The 'n'th Fibonacci number is " + fibonacci(n) + ".");
	}

	private int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return ((n - 1) + (n - 2));
		}
	}
}