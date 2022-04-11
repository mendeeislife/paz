import java.awt.Color;
import acm.program.*;
import acm.graphics.*;

public class CheckerBoard extends GraphicsProgram {

	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;

	public void run() {
		for (int row = 0; row < N_ROWS; row++) {
			double sqSize = (double) getHeight() / N_ROWS;
			for (int column = 0; column < N_COLUMNS; column++) {
				double x = column * sqSize;
				double y = row * sqSize;
				double offSet = (getWidth() / 2) - ((sqSize * N_COLUMNS) / 2);
				GRect sq = new GRect((x + offSet), y, sqSize, sqSize);
				sq.setFilled((row + column) % 2 != 0);
				sq.setColor(Color.GRAY);
				sq.setFillColor(Color.GRAY);
				add(sq);
				if ((row + column) % 2 != 0) {
					GOval checker = new GOval((x + offSet), y, sqSize, sqSize);
					checker.setFilled(true);
					if (row < 3) {
						checker.setColor(Color.RED);
						checker.setFillColor(Color.RED);
						add(checker);
					} else if (row > 4) {
						checker.setColor(Color.BLACK);
						checker.setFillColor(Color.BLACK);
						add(checker);
					}
				}
			}
		}
	}
}