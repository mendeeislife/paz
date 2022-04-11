import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Target extends GraphicsProgram {

	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 10;

	public void run() {

		double offset = ((OUTER_RADIUS - INNER_RADIUS) / (N_CIRCLES - 1));
		double center_x = getWidth() / 2;
		double center_y = getHeight() / 2;

		for (int i = 0; i <= N_CIRCLES; i++) {

			double x = (center_x - (OUTER_RADIUS - (offset * i)));
			double y = (center_y - (OUTER_RADIUS - (offset * i)));
			double r = (OUTER_RADIUS - (offset * i));

			if (i % 2 == 0) {
				add(createFilledCircle(x, y, r, Color.RED));
			} else {
				add(createFilledCircle(x, y, r, Color.WHITE));
			}
		}
	}

	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x, y, r * 2, r * 2);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
}