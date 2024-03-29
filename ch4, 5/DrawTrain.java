import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class DrawTrain extends GraphicsProgram {
	//Dimensions of template 'car'.
	private static final double CAR_WIDTH = 75;
	private static final double CAR_HEIGHT = 36;
	//Distance from edge of frame to bottom of 'car'.
	private static final double CAR_BASELINE = 10;
	//Length of 'connector'.
	private static final double CONNECTOR = 6;
	//Radius of 'wheel'.
	private static final double WHEEL_RADIUS = 8;
	private static final double WHEEL_INSET = 16;
	//Dimensions of 'cab'.
	private static final double CAB_WIDTH = 35;
	private static final double CAB_HEIGHT = 8;
	//Dimensions of 'smokestack'.
	private static final double SMOKESTACK_WIDTH = 8;
	private static final double SMOKESTACK_HEIGHT = 8;
	private static final double SMOKESTACK_INSET = 8;
	//Dimensions of 'door'.
	private static final double DOOR_WIDTH = 18;
	private static final double DOOR_HEIGHT = 32;
	//Dimensions of 'cupola'.
	private static final double CUPOLA_WIDTH = 35;
	private static final double CUPOLA_HEIGHT = 8;
	
	public void run() {
		
		double trainWidth = (3 * CAR_WIDTH) + (4 * CONNECTOR);
		double x = ((getWidth() - trainWidth) / 2);
		double y = getHeight();
		double bx = (CAR_WIDTH + CONNECTOR);
		double cx = (getWidth() / 2) + (CAR_WIDTH / 2);
		
		drawEngine(x, y);
		drawBoxcar(x + bx, y, Color.GREEN);
		drawCaboose(cx, y, Color.RED);
	}
	
	private void drawEngine(double x, double y) {
		drawCarFrame(x, y, Color.BLACK);
		drawCab(x, y);
		drawSmokeStack(x, y);
		drawCowCatch(x, y);
	}
	
	private void drawBoxcar(double x, double y, Color color) {
		double x0 = ((x + CONNECTOR) + (CAR_WIDTH / 2) - DOOR_WIDTH);
		double y0 = (y - CAR_BASELINE - DOOR_HEIGHT);
		double x1 = (x + CONNECTOR + (CAR_WIDTH / 2));
		
		drawCarFrame(x, y, color);
		add(new GRect(x0, y0, (DOOR_WIDTH * 2), DOOR_HEIGHT));
		add(new GLine(x1 , y - CAR_BASELINE, x1, y - CAR_BASELINE - DOOR_HEIGHT));
	}
	
	private void drawCaboose(double x, double y, Color color) {
		double x0 = (x + CONNECTOR) + ((CAR_WIDTH / 2) - (CUPOLA_WIDTH / 2));
		double y0 = (y - CAR_BASELINE - CAR_HEIGHT - CUPOLA_HEIGHT);
		
		drawCarFrame(x, y, color);
		GRect cupola = new GRect(x0, y0, CUPOLA_WIDTH, CUPOLA_HEIGHT);
		cupola.setFilled(true);
		cupola.setFillColor(color);
		add(cupola);
	}
	
	private void drawCarFrame(double x, double y, Color color) {
		double x0 = (x + CONNECTOR);
		double y0 = (y - CAR_BASELINE);
		double top = (y0 - CAR_HEIGHT);
		
		add(new GLine(x, y0, ((x + CAR_WIDTH) + (2 * CONNECTOR)), y0));
		
		drawWheel((x0 + WHEEL_INSET), (y - WHEEL_RADIUS));
		drawWheel((x0 + CAR_WIDTH - WHEEL_INSET), (y - WHEEL_RADIUS));
		
		GRect car = new GRect(x0, top, CAR_WIDTH, CAR_HEIGHT);
		car.setFilled(true);
		car.setFillColor(color);
		add(car);
	}
	
	private void drawCab(double x, double y) {
		double x0 = ((x + CONNECTOR) + (CAR_WIDTH - CAB_WIDTH));
		double y0 = (y - CAR_BASELINE - CAR_HEIGHT - CAB_HEIGHT);
		
		GRect cab = new GRect(x0, y0, CAB_WIDTH, CAB_HEIGHT);
		cab.setFilled(true);
		cab.setFillColor(Color.BLACK);
		add(cab);
	}
	
	private void drawSmokeStack(double x, double y) {
		
		double x0 = (x + CONNECTOR + SMOKESTACK_INSET);
		double y0 = (y - CAR_BASELINE - CAR_HEIGHT - SMOKESTACK_HEIGHT);
		
		GRect smokeStack = new GRect(x0, y0, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
		smokeStack.setFilled(true);
		smokeStack.setFillColor(Color.BLACK);
		add(smokeStack);
	}
	
	private void drawCowCatch(double x, double y) {
		double x1 = (x + (CONNECTOR / 2));
		double x2 = (x + CONNECTOR);
		double y1 = (y - CAR_BASELINE);
		double y2 = (y1 - (CAR_HEIGHT / 2));
		
		add(new GLine(x, y1, x2, y2));
		add(new GLine(x1, y1, x2, y2));
	}
	
	private void drawWheel(double x, double y) {
		double r = WHEEL_RADIUS;
		GOval wheel = new GOval(x - r, y - r, r * 2, r * 2);
		wheel.setFilled(true);
		wheel.setFillColor(Color.GRAY);
		add(wheel);
	}
}