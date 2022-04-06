import acm.graphics.*;
import acm.program.*;

public class HelloProgram extends GraphicsProgram {
	
	public void run() {
		this.resize(200, 200);
		add(new GLabel("I love Java", 100, 75));
		add(new GLabel("Mendsaikhan", 125, 200));
	}
	
}
