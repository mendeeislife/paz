import acm.program.*;

public class LaunchWhile extends ConsoleProgram {

	public void run() {
		int t = START;
		while (t >= 0) {
			println(t);
			pause(1000);
			t--;
		}
		println("LiftOff!");
	}

	private static final int START = 10;
}