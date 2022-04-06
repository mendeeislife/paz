import acm.program.*;

public class TriangleArea extends ConsoleProgram {
	
	public void run() {
		println("This program calculates S(area) of triangle.");
		
		// Getting input from user
		double b = readDouble("Enter base: ");
		double h = readDouble("Enter height: ");
		
		// Calculating area by formula
		double s = (b * h) / 2;
		
		// Printing calculated area
		println("Area of triangle = " + s);
	}
	
}