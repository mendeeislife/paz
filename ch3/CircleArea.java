import acm.program.*;

public class CircleArea extends ConsoleProgram {
	
	public void run() {
		println("This program calculates Circle area.");
		
		double r = readDouble("Enter the radius of circle: ");
		
		double A = PI * (r * r);
		
		println("Area of circle = " + Math.round(A * 100)/100.0);
		
	}
	private static final double PI = 3.14159265358979323846;
}