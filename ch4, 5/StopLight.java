import java.awt.*;
import acm.program.*;
import acm.graphics.*;

public class StopLight extends GraphicsProgram {

	private static final double FRAME_WIDTH = 50;
	private static final double FRAME_HEIGHT = 100;
	private static final double LAMP_RADIUS = 10;

	public void run() {

		double x = getWidth() / 2;
		double y = getHeight() / 2;
		double offSet = (FRAME_HEIGHT / 4);

		add(createFilledRect(x, y, FRAME_WIDTH, FRAME_HEIGHT, Color.GRAY));
		add(createFilledCircle(x, y - offSet, LAMP_RADIUS, Color.RED));
		add(createFilledCircle(x, y, LAMP_RADIUS, Color.YELLOW));
		add(createFilledCircle(x, y + offSet, LAMP_RADIUS, Color.GREEN));
	}

	private GRect createFilledRect(double x, double y, double width, double height, Color color) {
		GRect stopLight = new GRect(x - (width / 2), y - (height / 2), width, height);
		stopLight.setFilled(true);
		stopLight.setFillColor(color);
		return stopLight;
	}

	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x - r, y - r, r * 2, r * 2);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
}