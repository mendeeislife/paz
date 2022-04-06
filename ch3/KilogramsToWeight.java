import acm.program.*;

public class KilogramsToWeight extends ConsoleProgram {
	
	public void run() {
		println("This program converts kilograms to English weight.");
		
		double kg = readDouble("Enter number of feet: ");
		
		double pounds = kg * POUNDS_PER_KILOGRAM;
		double ounces = pounds * OUNCES_PER_POUND;
		
		println(kg + " kilogram = " + pounds + " pounds = " + ounces + "ounces.");
	}
	
	private static final double POUNDS_PER_KILOGRAM = 2.2;
	private static final double OUNCES_PER_POUND = 16;
	
}