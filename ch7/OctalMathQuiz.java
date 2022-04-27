import acm.program.*;
import acm.util.RandomGenerator;

public class OctalMathQuiz extends ConsoleProgram {
	// Private constants.
	private static final int NUMBER_OF_QUESTIONS = 10;
	private static final int LARGEST_NUMBER = 20;
	private static final int NUMBER_OF_TRIES = 3;
	// Private instance variables.
	private int score = 0;
	// Initializes random generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	/**
	 * Runs program.
	 */
	public void run() {
		println("Welcome to the octal Math Quiz.\n");
		for (int i = 1; i <= NUMBER_OF_QUESTIONS; i++) {
			getQuestion(i);
		}
		println("\nYou got " + score + " questions right!");
	}
	// Determines if question will be addition or subtraction.
	private void getQuestion(int i) {
		if (rgen.nextBoolean()) {
			getAddition(i);
		} else {
			getSubtraction(i);
		}
	}
	// Generates random subtraction question.
	private void getSubtraction(int i) {
		int n1 = rgen.nextInt(0, LARGEST_NUMBER);
		int n2 = rgen.nextInt(0, LARGEST_NUMBER);
		if ((n1 - n2) >= 0) {
			int answer = n1 - n2;
			String input = readLine(i + ") What is " + n1 + " - " + n2 + " in base 8? ");
			checkAnswer(answer, input);
		} else {
			int answer = n2 - n1;
			String input = readLine(i + ") What is " + n2 + " - " + n1 + " in base 8? ");
			checkAnswer(answer, input);
		}
	}
	// Generates random addition question.
	private void getAddition(int i) {
		int n1 = rgen.nextInt(0, LARGEST_NUMBER);
		int n2 = rgen.nextInt(0, LARGEST_NUMBER - n1);
		int answer = n1 + n2;
		String input = readLine(i + ") What is " + n1 + " + " + n2 + " in base 8? ");
		checkAnswer(answer, input);
	}
	// Compares user input to correct answer.
	private void checkAnswer(int answer, String input) {
		int wrongAnswers = 0;
		// Loops until either correct answer is given or NUMBER_OF_TRIES reached.
		while (true) {
			// Converts string into an integer value equal to hexadecimal.
			int dec = Integer.parseInt(input, 16);
			// Checks if answer is correct
			if (answer == dec) {
				println(getRemark());
				score++;
				break;
			} else if (wrongAnswers < (NUMBER_OF_TRIES - 1)) {
				input = readLine("Incorrect, try a different answer: ");
				wrongAnswers++;
			} else {
				println("Incorrect, the answer is " + Integer.toHexString(answer) + ".");
				break;
			}
		}
	}
	// Generates a random encouraging remark when user gets correct answer.
	private String getRemark() {
		switch (rgen.nextInt(1, 5)) {
			case 1: return "That's right!";
			case 2: return "Awesome answer!";
			case 3: return "Great job!";
			case 4: return "This is too easy for you!";
			default: return "Congrats! You're right!";
		}
	}
}