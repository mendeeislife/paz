import acm.program.*;

public class FahrenheitToCelsius extends ConsoleProgram {

	public void run() {
		println("This program converts Fahrenheit to Celsius.");

		double fahrenheit = readDouble("Enter Fahrenheit temperature: ");

		double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);

		println("Celsius equivalent = " + celsius);

	}
}