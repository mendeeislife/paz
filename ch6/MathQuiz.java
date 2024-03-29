import acm.program.*;
import acm.util.*;

public class MathQuiz extends ConsoleProgram {
	// Initializes constant values.
	private static final int NUMBER_OF_QUESTIONS = 10;
	private static final int LARGEST_NUMBER = 20;
	private static final int NUMBER_OF_TRIES = 3;
	private int score = 0;
	// Initializes instance variable to generate random numbers.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		println("Welcome to Math Quiz.");
		println();
		for (int i = 1; i <= NUMBER_OF_QUESTIONS; i++) {
			getQuestion(i);
		}
		println();
		println("You got " + score + " questions right, out of " + NUMBER_OF_QUESTIONS);
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
		// Random values generated for question.
		int n1 = rgen.nextInt(0, LARGEST_NUMBER);
		int n2 = rgen.nextInt(0, LARGEST_NUMBER);
		
		// Checks to make sure answer does not fall below zero.
		if ((n1 - n2) >= 0) {
			int answer = n1 - n2;
			int input = readInt(i + ") What is " + n1 + " - " + n2 + " ? ");
			checkAnswer(answer, input);
		} else {
			int answer = n2 - n1;
			int input = readInt(i + ") What is " + n2 + " - " + n1 + " ? ");
			checkAnswer(answer, input);
		}
	}

	// Generates random addition question.
	private void getAddition(int i) {
		// Random values generated for question.
		int n1 = rgen.nextInt(0, LARGEST_NUMBER);
		int n2 = rgen.nextInt(0, LARGEST_NUMBER - n1);
		int answer = n1 + n2;
		int input = readInt(i + ") What is " + n1 + " + " + n2 + " ? ");
		checkAnswer(answer, input);
	}

	// Compares user input to correct answer.
	private void checkAnswer(int answer, int input) {
		int wrongAnswers = 0;
		// Loops until either correct answer is given or NUMBER_OF_TRIES reached.
		while (true) {
			// Checks if answer is correct.
			if (answer == input) {
				println(getRemark());
				score++;
				println();
				break;
			} else if (wrongAnswers < (NUMBER_OF_TRIES - 1)) {
				input = readInt("Incorrect, try a different answer: ");
				wrongAnswers++;
			} else {
				println("Incorrect, the answer is " + answer + ".");
				break;
			}
		}	
	}
	
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