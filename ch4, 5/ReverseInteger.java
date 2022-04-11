import acm.program.*;

public class ReverseInteger extends ConsoleProgram {

	public void run() {
		println("This program reverses the digits in an integer.");
		int number = readInt("Enter a positive integer: ");
		int reverse = 0;
		while (number > 0) {
			int digit = (number % 10);
			number /= 10;
			reverse = (reverse * 10) + digit;
		}
		println("The reversed number is: " + reverse);
	}
}