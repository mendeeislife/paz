import acm.graphics.*;
import acm.program.*;

public class DrawHouse extends GraphicsProgram {
	public void run() {
		setSize(APP_WIDTH, APP_HEIGHT);
		
		//Main Body
		add(new GRect(200, 150, APP_WIDTH/2, APP_HEIGHT/2));

		//Left window
		add(new GRect(240, 200, WINDOW_SIZE, WINDOW_SIZE));

		//Right window
		add(new GRect(480, 200, WINDOW_SIZE, WINDOW_SIZE));

		//Door
		add(new GRect(375, 240, DOOR_WIDTH, DOOR_HEIGHT));

		//Door knob
		add(new GOval(420, 290, DOOR_KNOB_SIZE, DOOR_KNOB_SIZE));

		//Left line
		add(new GLine(200, 150, APP_WIDTH/2, APP_HEIGHT/8));

		//Right line
		add(new GLine(600, 150, APP_WIDTH/2, APP_HEIGHT/8));
	}
	
	private static final int APP_WIDTH = 800;
	private static final int APP_HEIGHT = 400;
	private static final int WINDOW_SIZE = 75;
	private static final int DOOR_WIDTH = 60;
	private static final int DOOR_HEIGHT = 110;
	private static final int DOOR_KNOB_SIZE = 12;

}