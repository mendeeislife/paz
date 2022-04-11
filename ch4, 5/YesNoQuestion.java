import acm.program.*;

public class YesNoQuestion extends ConsoleProgram {

	private static final String RULES = "Please answer 'yes' or 'no'.";
	private static final String QUESTION = "Would you like instructions? ";

	public void run() {
		askYesNoQuestion(QUESTION);
	}

	private boolean askYesNoQuestion(String str) {
		String answer = readLine(QUESTION);

		if (answer.equals("yes")) {
			return true;
		} else if (answer.equals("no")) {
			return false;
		} else {
			println(RULES);
			return askYesNoQuestion(str);
		}
	}
}