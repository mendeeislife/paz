import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class RobotFace extends GraphicsProgram {

	public void run() {
		GRect face = new GRect(50, 50, 200, 300);
		face.setFilled(true);
		face.setFillColor(Color.GRAY);
		add(face);

		GOval eyeL = new GOval(75, 75, 50, 50);
		eyeL.setFilled(true);
		eyeL.setFillColor(Color.ORANGE);
		add(eyeL);

		GOval eyeR = new GOval(175, 75, 50, 50);
		eyeR.setFilled(true);
		eyeR.setFillColor(Color.ORANGE);
		add(eyeR);

		GRect nose = new GRect(140, 175, 20, 50);
		nose.setFilled(true);
		nose.setFillColor(Color.black);
		add(nose);

		GRect mouth = new GRect(60, 250, 180, 60);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		add(mouth);
	}

}