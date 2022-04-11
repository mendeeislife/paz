import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class BouncingBall extends GraphicsProgram {

	private static final int BALL_SIZE = 50;
	private static final int SPEED = 3;

	public void run() {
		double startx = ((getWidth() / 2) - (BALL_SIZE / 2));
		double starty = ((getHeight() / 2) - (BALL_SIZE / 2));

		GOval ball = new GOval(startx, starty, BALL_SIZE, BALL_SIZE);
		ball.setFilled(true);
		ball.setFillColor(Color.BLACK);
		add(ball);

		int dx = 1;
		int dy = 1;

		while (true) {
			ball.move(dx, dy);
			pause(SPEED);

			double x = ball.getX();
			double y = ball.getY();

			if ((x >= (getWidth() - BALL_SIZE)) || (x == 0)) {
				dx = -dx;
			}
			if ((y >= (getHeight() - BALL_SIZE)) || (y == 0)) {
				dy = -dy;
			}
		}
	}
}