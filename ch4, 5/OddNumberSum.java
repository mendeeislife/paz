import acm.program.*;

public class OddNumberSum extends ConsoleProgram {

	public void run() {
		println("This program will calculates and the sum of the first N odd integers.");
		int n = readInt("Please enter how many odd integers to add: ");
		int sum = 0;
		for (int i = 1; n > 0; i += 2) {
			sum += i;
			n--;
		}
		println("Niilber: " + sum);
	}
}