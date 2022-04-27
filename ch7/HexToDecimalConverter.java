import acm.program.*;

public class HexToDecimalConverter extends ConsoleProgram {
	
	public void run() {
		println("This program converts hexadical to decimal.");
		println("Enter 0 to stop.");
		String hex = "";
		while (true) {
			hex = readLine("\nEnter a hexadecimal number : ");
			if (hex.equals("0"))
				break;
			// Integer.parseInt method converts the string 'hex' into an integer using base 16 calculation.
			int dec = Integer.parseInt(hex, 16);
			// Integer.toString method converts the integer value of 'dec' to a String.
			println(hex + " hex = " + Integer.toString(dec) + " decimal");
		}
	}
}