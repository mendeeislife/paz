import acm.program.*;

public class ThisOldMan extends ConsoleProgram {

	public void run() {
		for (int i = 1; i < 11; i++) {
			println("This old man, he played " + i + ".");
			String word = "thumb.";
			switch (i) {
			case 1:
				word = "thumb.";
				break;
			case 2:
				word = "shoe.";
				break;
			case 3:
				word = "knee.";
				break;
			case 4:
				word = "door.";
				break;
			case 5:
				word = "hive.";
				break;
			case 6:
				word = "sticks.";
				break;
			case 7:
				word = "heaven.";
				break;
			case 8:
				word = "plate.";
				break;
			case 9:
				word = "spine.";
				break;
			default:
				word = "shin.";
				break;
			}
			println("He played knick-knack on my " + word);
			println("With a knick-knack, paddy-whack.");
			println("Give your dog a bone.");
			println("This old man came rolling home.");
			println();
		}
	}
}