import acm.program.*;
import acm.graphics.*;

public class Pyramid extends GraphicsProgram {

	private static final int BRICK_HEIGHT = 20;
	private static final int BRICK_WIDTH = 60;
	private static final int BRICK_BASE = 10;

	public void run() {
		int bh = BRICK_HEIGHT;
		int bw = BRICK_WIDTH;
		int br = BRICK_BASE;
		int bb = BRICK_BASE;

		for (int row = 0; row < BRICK_BASE; row++) {
			double x = (getWidth()) - ((bb * bw) / 2);
			double y = (getHeight() / 2) + ((bh * br) / 2);
			for (int column = 0; column < bb; column++) {
				GRect brick = new GRect(x, y, bw, bh);
				add(brick);
				x += bw;
				bb -= 1;
				br -= 2;
			}
		}
	}
}