import java.awt.Dimension;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class TicTacToeBoard extends GraphicsProgram {
	
	public void run() {

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		Dimension d = getSize();

		add(new GLine(d.getWidth() / 3, d.getHeight() / 3, d.getWidth() / 3 + BOARD_SIZE, d.getHeight() / 3));

		add(new GLine(d.getWidth() / 3, d.getHeight() / 3 + BOARD_SIZE / 2, d.getWidth() / 3 + BOARD_SIZE, d.getHeight() / 3 + BOARD_SIZE / 2));

		add(new GLine(d.getWidth() / 3 + BOARD_SIZE / 3, d.getHeight() / 3 - BOARD_SIZE / 3, d.getWidth() / 3 + BOARD_SIZE / 3, d.getHeight() / 3 + BOARD_SIZE));

		add(new GLine(d.getWidth() / 3 + 2 * BOARD_SIZE / 3, d.getHeight() / 3 - BOARD_SIZE / 3, d.getWidth() / 3 + 2 * BOARD_SIZE / 3, d.getHeight() / 3 + BOARD_SIZE));

	}
	
	private static final int BOARD_SIZE = 100;

	private static final int WINDOW_WIDTH = 250;
	private static final int WINDOW_HEIGHT = 250;

}