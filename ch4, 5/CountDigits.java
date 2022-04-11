import acm.program.*;

public class CountDigits extends ConsoleProgram {

	public void run() {
		int n = readInt("Please enter a POSITIVE integer: ");
		println("The number " + n + " has " + countDigits(n) + " digits.");
	}

	private int countDigits(int n) {
		int digits = 0;
		while (n > 0) {
			n /= 10;
			digits++;
		}
		return digits;
	}
}