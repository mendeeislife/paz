import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;

public class MouseTracker extends GraphicsProgram {
	
	public void run() {
		label = new GLabel("");
		
		// Must call this method to be able to get mouse events
		addMouseListeners();
	}
	
	// This method is called everytime user moves mouse
	public void mouseMoved(MouseEvent e) {
		label.setLabel("(" + e.getX() + ", " + e.getY() + ")");
		add(label, e.getX() - 60, e.getY());
	}
	
	/* Private instance variable */
	private GLabel label;
}