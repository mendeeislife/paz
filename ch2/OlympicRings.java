import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class OlympicRings extends GraphicsProgram {

	public void run() {
		GOval blueRing = new GOval(50, 50, RING_SIZE, RING_SIZE);
		blueRing.setColor(Color.BLUE);
		add(blueRing);

		GOval blackRing = new GOval(170, 50, RING_SIZE, RING_SIZE);
		blackRing.setColor(Color.BLACK);
		add(blackRing);

		GOval redRing = new GOval(290, 50, RING_SIZE, RING_SIZE);
		redRing.setColor(Color.RED);
		add(redRing);

		GOval yellowRing = new GOval(110, 110, RING_SIZE, RING_SIZE);
		yellowRing.setColor(Color.YELLOW);
		add(yellowRing);

		GOval greenRing = new GOval(230, 110, RING_SIZE, RING_SIZE);
		greenRing.setColor(Color.GREEN);
		add(greenRing);
	}

    private static final int RING_SIZE = 100;

}