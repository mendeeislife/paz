import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	

	private static final int PIXELS_PER_INCH = 72;
	private static final double RADIUS_OUTER_CIRCLE = 1.0;	
	private static final double RADIUS_WHITE_CIRCLE = 0.65;	
	private static final double RADIUS_INNER_CIRCLE = 0.3;	


	public void run() {
		double x = getWidth() / 2;
		double y = getHeight() /2;
		drawCircle(x, y, RADIUS_OUTER_CIRCLE * PIXELS_PER_INCH, Color.RED);
		drawCircle(x, y, RADIUS_WHITE_CIRCLE * PIXELS_PER_INCH, Color.WHITE);
		drawCircle(x, y, RADIUS_INNER_CIRCLE * PIXELS_PER_INCH, Color.RED);
	}

	private void drawCircle(double cx, double cy, double r, Color c) {
		double x = cx - r;
		double y = cy - r;
		GOval circle = new GOval(2*r, 2*r);
		circle.setColor(c);
		circle.setFilled(true);
		add(circle, x, y);
	}

}