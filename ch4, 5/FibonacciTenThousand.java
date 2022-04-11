import acm.program.*;

public class FibonacciTenThousand extends ConsoleProgram {

	public void run() {
		println("This program lists the Fibonacci Sequences that are less than 10,000.");
		int f = 0;
		int f1 = 0;
		int f2 = 1;
		println("F0 = 0");
		println("F1 = 1");
		for (int i = 2; f <= 10000; i++) {
			f = f1 + f2;
			if (f < 10000) {
				println("F" + i + " = " + f);
				f1 = f2;
				f2 = f;
			} else {
				break;
			}
		}
	}
}