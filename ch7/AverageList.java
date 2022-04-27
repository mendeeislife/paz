import acm.program.*;

public class AverageList extends ConsoleProgram {

	public void run() {
		println("This program averages a list of integers.");
		println();
		println("Enter values, one per line, using blank line to singal the end of the list.");
		println();
		int total = 0;
		int count = 0;
		for (count = 0; total != -1; count++) {
			String value = readLine(" ? ");
			if (value.equals(""))
				break;
			total += Integer.parseInt(value);
		}
		println("The average is " + (total / count));
	}
}