import acm.program.*;

public class RaiseIntToPower extends ConsoleProgram {

	public void run() {
		int n = readInt("Integer: ");
		int k = readInt("Exponent: ");

		for (int i = 0; i < (k + 1); i++) {
			println(n + " to the power of " + i + " = " + raiseIntToPower(n, i));
		}
	}

	private int raiseIntToPower(int n, int k) {
		int total = 1;
		for (int i = 0; i < k; i++) {
			total *= n;
		}
		return total;
	}
}