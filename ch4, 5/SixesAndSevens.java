import acm.program.*;

public class SixesAndSevens extends ConsoleProgram {

	public void run() {
		int start = 1, end = 100;
		SixSeven(start, end);
	}

	public void SixSeven(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (((i % 6 == 0) || (i % 7 == 0)) && !((i % 6 == 0) && (i % 7 == 0))) {
				println(i);
			}
		}
	}
}