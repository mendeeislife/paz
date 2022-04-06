import acm.program.*;

public class FeetAndInchesToCentimeters extends ConsoleProgram {
	
	public void run() {
		println("This program converts feet and inches to centimeters.");
		
		double feet = readDouble("Enter number of feet: ");
		double inch = readDouble("Enter number of inches: ");
		
		double centimeters = (feet * CENTIMETERS_PER_FEET) + (inch * CENTIMETERS_PER_INCH);
		
		println(feet + "ft " + inch + "in = " + centimeters + "cm");
	}
	
	private static final double CENTIMETERS_PER_INCH = 2.54;
	private static final double CENTIMETERS_PER_FEET = 30.48;
	
}