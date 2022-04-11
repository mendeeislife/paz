import acm.program.*;

public class DigitalRoot extends ConsoleProgram {

	public void run() {
		println("This program will find the Digital Root of a positive integer.");
		int n = readInt("Please enter a POSITIVE integer: ");
		int dsum = 0;
		while (true) {
			while (n > 0) {
				dsum += (n % 10);
				n /= 10;
			}
			if (dsum < 10) {
				break; // 1 tsiprtai bolvol loop zogsono
			} else {
				n = dsum;
				dsum = 0;
			}
		}
		println("The Digital root is: " + dsum);
	}
}