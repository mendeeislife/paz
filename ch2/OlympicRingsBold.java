import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class OlympicRingsBold extends GraphicsProgram {

	public void run() {
		
		GOval blueRing1 = new GOval(50, 50, ringSize, ringSize);
		blueRing1.setColor(Color.BLUE);
		add(blueRing1);
		GOval blueRing2 = new GOval(51, 51, ringSize-2, ringSize-2);
		blueRing2.setColor(Color.BLUE);
		add(blueRing2);
		GOval blueRing3 = new GOval(52, 52, ringSize-4, ringSize-4);
		blueRing3.setColor(Color.BLUE);
		add(blueRing3);

		GOval blackRing1 = new GOval(170, 50, ringSize, ringSize);
		blackRing1.setColor(Color.BLACK);
		add(blackRing1);
		GOval blackRing2 = new GOval(171, 51, ringSize-2, ringSize-2);
		blackRing2.setColor(Color.BLACK);
		add(blackRing2);
		GOval blackRing3 = new GOval(172, 52, ringSize-4, ringSize-4);
		blackRing3.setColor(Color.BLACK);
		add(blackRing3);

		GOval redRing1 = new GOval(290, 50, ringSize, ringSize);
		redRing1.setColor(Color.RED);
		add(redRing1);
		GOval redRing2 = new GOval(291, 51, ringSize-2, ringSize-2);
		redRing2.setColor(Color.RED);
		add(redRing2);
		GOval redRing = new GOval(292, 52, ringSize-4, ringSize-4);
		redRing.setColor(Color.RED);
		add(redRing);

		GOval yellowRing1 = new GOval(110, 110, ringSize, ringSize);
		yellowRing1.setColor(Color.YELLOW);
		add(yellowRing1);
		GOval yellowRing2 = new GOval(111, 111, ringSize-2, ringSize-2);
		yellowRing2.setColor(Color.YELLOW);
		add(yellowRing2);
		GOval yellowRing3 = new GOval(112, 112, ringSize-4, ringSize-4);
		yellowRing3.setColor(Color.YELLOW);
		add(yellowRing3);

		GOval greenRing1 = new GOval(230, 110, ringSize, ringSize);
		greenRing1.setColor(Color.GREEN);
		add(greenRing1);
		GOval greenRing2 = new GOval(231, 111, ringSize-2, ringSize-2);
		greenRing2.setColor(Color.GREEN);
		add(greenRing2);
		GOval greenRing3 = new GOval(232, 112, ringSize-4, ringSize-4);
		greenRing3.setColor(Color.GREEN);
		add(greenRing3);
	}

	private static final int RING_SIZE = 100;

}