import acm.program.*;

public class Quadratic extends ConsoleProgram {

	public void run() {
		println("Enter coefficients for the equation: ");
		int a = readInt("a: ");
		int b = readInt("b: ");
		int c = readInt("c: ");

		if ((4 * a * c) > (b * b)) {
			println("Kvadrat tegshitgel hariugui");
		} else {
			quadraticEquation(a, b, c);
		}
	}

	private void quadraticEquation(double a, double b, double c) {
		double d = ((b * b) - (4 * a * c));
		double x1 = (((-b) + Math.sqrt(d)) / (2 * a));
		double x2 = (((-b) - Math.sqrt(d)) / (2 * a));
		println("The first solution is " + x1);
		println("The second solution is " + x2);
	}
}