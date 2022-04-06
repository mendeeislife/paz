import acm.graphics.*;
import acm.program.*;

public class DrawHouse extends GraphicsProgram {
	public void run() {
		
		add(new GRect(200, 150, 400, 200));
		
		add(new GRect(240, 200, 75, 75));
		
		add(new GRect(480, 200, 75, 75));
		
		add(new GRect(375, 240, 60, 110));
		
		add(new GOval(420, 290, 12, 12));
		
		add(new GLine(200, 150, 400, 50));
		
		add(new GLine(600, 150, 400, 50));
	}

}